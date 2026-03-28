# Use lightweight runtime image (smaller than JDK)
FROM eclipse-temurin:17-jre-jammy

# Create app directory
WORKDIR /app

# Copy built JAR from Jenkins workspace
COPY target/*.jar app.jar

# Expose application port
EXPOSE 9001

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]