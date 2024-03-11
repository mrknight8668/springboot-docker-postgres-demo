# syntax=docker/dockerfile:1
# which Java official image?
FROM openjdk:23-oraclelinux8
# working directory
WORKDIR /app
#copy from your Host (PC,laptop) to container
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#Run this inside the image
RUN ./mvnw dependency:go-offline
#copy src
COPY src ./src
#run inside container
CMD ["./mvnw", "spring-boot:run"]