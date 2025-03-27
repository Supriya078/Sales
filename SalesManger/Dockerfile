# Use the official OpenJDK image as a base
FROM openjdk:8

# Set the working directory
#WORKDIR /app

# Copy the JAR file into the container
COPY target/SalesManger-0.0.1-SNAPSHOT.jar SalesManger-0.0.1-SNAPSHOT.jar

# Expose the application port
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "SalesManger-0.0.1-SNAPSHOT.jar"]