FROM maven:3.9.4-eclipse-temurin-20 as builder
WORKDIR /build
COPY . .
RUN mvn clean package

FROM eclipse-temurin:20-jre-alpine
COPY --from=builder /build/target/*-jar-with-dependencies.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]