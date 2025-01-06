FROM openjdk:21-jdk-slim
COPY target/search-0.0.1-SNAPSHOT.jar app.jar
# Expose the application port
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
