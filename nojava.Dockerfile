FROM maven:3-jdk-8-alpine
WORKDIR /opt/
COPY . .
RUN mvn clean install
ENTRYPOINT ["java", "-jar", "target/spring-docker-training-0.0.1-SNAPSHOT.jar"]