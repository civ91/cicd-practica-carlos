# Imagen base de Java 11
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia los archivos del proyecto
COPY target/app.jar .

# Expone el puerto 8080
EXPOSE 8080

# Ejecuta el comando para iniciar la aplicación
CMD ["java", "-jar", "app.jar"]
