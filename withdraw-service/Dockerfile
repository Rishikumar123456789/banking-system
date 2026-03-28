# Lightweight runtime image
FROM eclipse-temurin:17-jre-jammy

# App directory
WORKDIR /app

# Copy JAR built by Jenkins
COPY target/*.jar app.jar

# Expose port (update if needed)
EXPOSE 9004

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]