# 📦 Servicio REST API con Java + Docker

Este proyecto contiene una API REST desarrollada en Java (Spring Boot), preparada para ser ejecutada en un entorno **Docker** con comandos automatizados mediante un `Makefile`.

---

## 🔧 Requisitos previos

Antes de continuar asegúrate de tener instalado:

### 🐳 Docker

Puedes instalar Docker siguiendo la documentación oficial:
🔗 https://docs.docker.com/get-docker/

Para verificar si está instalado:

```bash
docker --version
```

### 🛠️ Make (opcional, recomendado para automatizar)

#### Linux / WSL:

```bash
sudo apt update && sudo apt install make -y
```

#### macOS (con Homebrew):

```bash
brew install make
```

#### Windows:

- Recomendado: usar WSL (Windows Subsystem for Linux)
- Alternativa: ejecutar los comandos del Makefile manualmente

---

## ⚙️ Variables por defecto

```makefile
SERVICE=restapi-java
PORT=8080
```

Puedes modificar estos valores en el archivo `Makefile` según tus necesidades.

---

## 🛠️ Comandos disponibles

| Comando              | Descripción                                                  |
|----------------------|--------------------------------------------------------------|
| `make docker-build`  | Compila el proyecto y construye la imagen Docker             |
| `make run`           | Ejecuta el contenedor si el puerto está disponible           |
| `make ps`            | Muestra si el contenedor está activo                         |
| `make clean-port`    | Libera el puerto si está ocupado                             |
| `make clean`         | Borra la imagen Docker y la carpeta `target` (build)         |
| `make down`          | Detiene y elimina el contenedor en ejecución (por PID real)  |
| `make help`          | Muestra los comandos disponibles                              |

---

## ▶️ Ejecución rápida

```bash
make docker-build
make run
```

La API quedará disponible en:
📡 `http://localhost:8080`

---

## 🧪 Prueba desde Postman

Puedes probar el endpoint de registro:

```
POST http://localhost:8080/api/registro
Content-Type: application/json
```

Ejemplo de JSON:

```json
{
  "nombres": "Juan",
  "apellidos": "Pérez",
  "numeroIdentificacion": "1712345678",
  "correoPrincipal": "juan@example.com",
  "clave": "secreta123",
  "...": "...otros campos"
}
```

---

## 🧼 Limpieza

```bash
make down
make clean
```

---

## 🌐 Configuración adicional

Si estás usando un frontend que consume esta API, asegúrate de:

- Definir `URL_ACTIVACION_FRONTEND` como variable de entorno (en `.env` o Docker)
- Que tu frontend esté corriendo en un puerto accesible
- Redirigir correctamente a `/activate?id={id}&codigo={codigo}`

---


---

> ✉️ *Este servicio incluye el envío de correos de activación usando Mailtrap o SMTP configurado correctamente.*


**Resumen de Configuración y Solución de Problemas: PostgreSQL 9.3 + Spring Boot + Docker**

---

### 1. Verificación de PostgreSQL

* Se verificó que `psql` está instalado usando:

  ```bash
  which psql
  ```
* Intento fallido de conexión local:

  ```bash
  psql -U postgres
  ```

  Error: no se pudo conectar al socket Unix.

---

### 2. Inicio manual de PostgreSQL

* Intento fallido como root:

  ```bash
  sudo /opt/PostgreSQL/9.3/bin/pg_ctl start -D /opt/PostgreSQL/9.3/data
  ```
* Se cambió al usuario correcto:

  ```bash
  sudo su - postgres
  /opt/PostgreSQL/9.3/bin/pg_ctl start -D /opt/PostgreSQL/9.3/data
  ```

  * Salto de advertencia: ya había un servidor activo.

---

### 3. Conexión exitosa a PostgreSQL

* Se logró la conexión con:

  ```bash
  psql -h 127.0.0.1 -U postgres
  ```

---

### 4. Configuración de datasources en Spring Boot

```properties
spring.datasource.jdbc-url=jdbc:postgresql://172.17.0.1:5432/usuarios2025-04-12-0630
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver

second.datasource.jdbc-url=jdbc:postgresql://172.17.0.1:5432/becas2025-04-12-0630
second.datasource.username=postgres
second.datasource.password=postgres
second.datasource.driver-class-name=org.postgresql.Driver
```

---

### 5. Errores comunes y soluciones

* **host.docker.internal no encontrado**: se reemplazó con `172.17.0.1`.
* **FATAL: no pg\_hba.conf entry...**:

  * PostgreSQL estaba rechazando conexiones externas desde Docker.

---

### 6. Ajustes necesarios en PostgreSQL

#### postgresql.conf

Se agregó:

```conf
listen_addresses = '*'
```

#### pg\_hba.conf

Se agregó al final:

```conf
host all all 172.17.0.0/16 trust
```

Esto permite conexiones desde la red Docker.

---

### 7. Reinicio de PostgreSQL

Para aplicar los cambios:

```bash
/opt/PostgreSQL/9.3/bin/pg_ctl -D /opt/PostgreSQL/9.3/data restart
```

---

### Estado Final

* PostgreSQL 9.3 funcionando correctamente.
* Spring Boot configurado con dos datasources.
* Conexión exitosa entre la app y PostgreSQL usando red Docker.
* Archivos `postgresql.conf` y `pg_hba.conf` correctamente ajustados.

---

**Notas:**

* PostgreSQL 9.3 es muy antiguo. Se recomienda actualizar si es posible.
* Considerar usar Docker para PostgreSQL y evitar instalaciones directas en el sistema operativo.

