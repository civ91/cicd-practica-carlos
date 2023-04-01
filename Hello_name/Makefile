# Variables de configuración
JAVAC=javac
JAVA=java
SRC_DIR=src/main/java/com/example
BUILD_DIR=target
MAIN_CLASS=com.example.Main

# Compilar el proyecto
compile:
	@if [ ! -d "$(BUILD_DIR)" ]; then mkdir -p $(BUILD_DIR); fi
	$(JAVAC) -d $(BUILD_DIR) $(SRC_DIR)/*.java -cp "$(shell mvn -q exec:exec -Dexec.executable='echo' -Dexec.args='%classpath')"

# Ejecutar la aplicación
run:
	$(JAVA) -cp $(BUILD_DIR):"$(shell mvn -q exec:exec -Dexec.executable='echo' -Dexec.args='%classpath')" $(MAIN_CLASS)

# Limpiar los archivos generados
clean:
	rm -rf $(BUILD_DIR)
