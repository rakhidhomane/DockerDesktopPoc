# syntax=docker/dockerfile:1
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

COPY HelloWorld.java ./
RUN javac HelloWorld.java

FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

RUN groupadd --system app && useradd --system --gid app app
COPY --from=build /app/HelloWorld.class ./

USER app
ENTRYPOINT ["java", "HelloWorld"]
