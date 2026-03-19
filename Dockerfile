FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
COPY mvnw.cmd .
COPY src src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre

WORKDIR /app

EXPOSE 8080

COPY --from=build /app/target/gamestore-0.0.1-SNAPSHOT.jar app.jar

# Define o comando de inicializacao do container
ENTRYPOINT ["java", "-jar", "app.jar"]
