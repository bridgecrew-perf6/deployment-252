# syntax=docker/dockerfile:1
FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]