# Etapa 1: build con Maven y Java 11
FROM maven:3.9.4-eclipse-temurin-11-alpine AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: run con JDK 11
FROM eclipse-temurin:11-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/restapi-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
