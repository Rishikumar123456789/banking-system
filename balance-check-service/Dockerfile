# Lightweight runtime image
FROM eclipse-temurin:17-jre-jammy

# App directory
WORKDIR /app

# Copy JAR built by Jenkins
COPY target/*.jar app.jar

# Expose port (change if your service uses different port)
EXPOSE 9003

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]