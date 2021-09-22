FROM maven:3.6.3-jdk-8-slim AS build
WORKDIR /home/app
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
COPY --from=build /home/app/target/spring-admin-client.jar spring-admin-client.jar
ENTRYPOINT ["sh", "-c", "java -jar /spring-admin-client.jar"]