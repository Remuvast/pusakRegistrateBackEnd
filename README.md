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
