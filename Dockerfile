FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]