# Variables de configuración
SRC_DIR=src/main/java/com/example
BUILD_DIR=target
MAIN_CLASS=com.example.Main

# Compilar el proyecto
compile:
	@if [ ! -d "$(BUILD_DIR)" ]; then mkdir -p $(BUILD_DIR); fi
	mvn clean compile -DskipTests

# Ejecutar los tests
test:
	mvn test

# Ejecutar la aplicación
run:
	mvn spring-boot:run

# Limpiar los archivos generados
clean:
	mvn clean
