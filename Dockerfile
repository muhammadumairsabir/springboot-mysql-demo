# Use the official OpenJDK image with Java 17 as a parent image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at the specified working directory
COPY target/app.jar /app/demo.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "demo.jar"]
