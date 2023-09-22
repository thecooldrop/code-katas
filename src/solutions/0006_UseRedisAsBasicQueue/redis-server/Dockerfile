FROM maven:3.9.4-amazoncorretto-20-al2023 as builder
WORKDIR /build
COPY /src /src
COPY pom.xml pom.xml
RUN mvn clean package

FROM eclipse-temurin:20-jre-alpine
COPY --from=builder /build/target/*-jar-with-dependencies.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]