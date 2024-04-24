FROM openjdk:21
EXPOSE 8080
ADD target/spring-docker-0.0.1-SNAPSHOT.jar spring-app.jar
ENTRYPOINT ["java", "-jar", "spring-app.jar"]
