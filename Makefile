# Nombre del servicio Docker
SERVICE=restapi-java
PORT=8080

# Verifica si el puerto 8080 está ocupado
check-port:
	@echo "🔎 Verificando puerto $(PORT)..."
	@if lsof -i :$(PORT) >/dev/null 2>&1; then \
		echo "❌ El puerto $(PORT) ya está en uso. Detén el proceso o usa otro puerto."; \
		lsof -i :$(PORT); \
		exit 1; \
	else \
		echo "✅ Puerto $(PORT) disponible."; \
	fi

# Construye la imagen Docker usando multi-stage build
docker-build:
	@echo "🐳 Construyendo imagen Docker..."
	docker build -t $(SERVICE) .

# Ejecuta el contenedor en el puerto especificado
run: check-port
	@echo "🚀 Ejecutando contenedor..."
	docker run --rm -p $(PORT):8080 $(SERVICE)

# Verifica contenedores activos
ps:
	docker ps | grep $(SERVICE) || echo "⛔ Ningún contenedor activo para $(SERVICE)"

# Limpia el puerto si está ocupado
clean-port:
	@echo "🧹 Verificando procesos en $(PORT)..."
	@if lsof -i :$(PORT) >/dev/null 2>&1; then \
		PID=$$(lsof -t -i :$(PORT)); \
		echo "🔪 Matando proceso $$PID..."; \
		sudo kill -9 $$PID; \
	else \
		echo "✅ Nada que limpiar."; \
	fi

# Limpia la imagen y archivos generados
clean:
	@echo "🧼 Limpiando..."
	-docker rmi -f $(SERVICE)
	-rm -rf target

# Ayuda
help:
	@echo "📌 Comandos disponibles:"
	@echo "  make docker-build  → Compila y construye imagen Docker"
	@echo "  make run           → Ejecuta el contenedor"
	@echo "  make ps            → Muestra contenedores activos"
	@echo "  make clean-port    → Libera el puerto $(PORT)"
	@echo "  make clean         → Borra la imagen Docker y el target"

# Detiene y elimina el contenedor por su PID real
down:
	@echo "🛑 Intentando detener contenedor basado en $(SERVICE)..."
	@CID=$$(docker ps -q --filter ancestor=$(SERVICE)); \
	if [ -n "$$CID" ]; then \
		PID=$$(docker inspect --format '{{.State.Pid}}' $$CID); \
		echo "🔪 Matando PID del contenedor: $$PID"; \
		sudo kill -9 $$PID && docker rm -f $$CID; \
		echo "✅ Contenedor eliminado."; \
	else \
		echo "⛔ No hay contenedor activo para $(SERVICE)"; \
	fi
