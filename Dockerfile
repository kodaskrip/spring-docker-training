FROM java:8
WORKDIR /opt
COPY target/spring-docker-training-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]