# Imagem base do java no dockerhub
FROM openjdk:21-jdk

# Copiar arquivo JAR para dentro do container
COPY target/deliveriesApi-0.0.1-SNAPSHOT.jar /app/deliveries.jar

# Comando para iniciar a aplicação
CMD ["java", "-jar", "/app/deliveries.jar"]