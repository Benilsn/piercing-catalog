FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/piercing-catalog-1.0.0.jar

EXPOSE ${PORT}

ADD ${JAR_FILE} app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]