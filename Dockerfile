# Dockerfile para Item API
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/apiitems-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]