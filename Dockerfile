FROM openjdk:8u181-jdk-alpine3.8

COPY target/SpringBootDataRest-1.0.1.jar app.jar

EXPOSE 7100

CMD ["java", "-jar", "app.jar"]

