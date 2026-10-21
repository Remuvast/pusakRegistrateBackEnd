# Etapa 1: build con Maven y Java 11
FROM maven:3.9.4-eclipse-temurin-11-alpine AS build
 
WORKDIR /app
 
# Crear el directorio .m2 y configurar el proxy nativo para Maven
RUN mkdir -p /root/.m2 && echo '<settings xmlns="http://apache.org" \
xmlns:xsi="http://w3.org" \
xsi:schemaLocation="http://apache.org https://apache.org"> \
<proxies> \
<proxy> \
<id>optional</id> \
<active>true</active> \
<protocol>http</protocol> \
<host>10.180.1.84</host> \
<port>3128</port> \
<nonProxyHosts>localhost|127.0.0.1|10.180.1.84|*.senescyt.gob</nonProxyHosts> \
</proxy> \
<proxy> \
<id>optional-ssl</id> \
<active>true</active> \
<protocol>https</protocol> \
<host>10.180.1.84</host> \
<port>3128</port> \
<nonProxyHosts>localhost|127.0.0.1|10.180.1.84|*.senescyt.gob</nonProxyHosts> \
</proxy> \
</proxies> \
</settings>' > /root/.m2/settings.xml
 
# Copiar el código fuente del proyecto
COPY . .
 
# Compilar cambiando el User-Agent a Mozilla/5.0 para que el proxy no rechace el WSDL gubernamental
RUN mvn clean generate-sources package -DskipTests -Dhttp.agent="Mozilla/5.0"
 
# Etapa 2: ambiente de ejecución con JDK 11 ligero
FROM eclipse-temurin:11-jdk-alpine
WORKDIR /app
 
# Copiar el artefacto JAR final de la etapa de compilación anterior
COPY --from=build /app/target/restapi-0.0.1-SNAPSHOT.jar app.jar
 
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
