# Lightweight runtime image
FROM eclipse-temurin:17-jre-jammy

# App directory
WORKDIR /app

# Copy JAR built by Jenkins
COPY target/*.jar app.jar

# Expose port (change if needed)
EXPOSE 9002

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]