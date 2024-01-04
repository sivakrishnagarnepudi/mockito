# Use a base image with Java 17 (for example, adoptopenjdk/openjdk17:alpine)
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/student-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Define the command to run your application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
