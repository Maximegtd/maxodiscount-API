# Utilise l'image OpenJDK 17
FROM openjdk:17-jdk-alpine

# Copie du JAR de module1 dans le conteneur
COPY target/product-service-1.0-SNAPSHOT.jar /app/product-service-1.0-SNAPSHOT.jar

# Exposition du port 8081 (ajuste en fonction des besoins de module1)
EXPOSE 8082

# Commande pour exécuter le module1 lors du démarrage du conteneur
CMD ["java", "-jar", "/app/product-service-1.0-SNAPSHOT.jar"]