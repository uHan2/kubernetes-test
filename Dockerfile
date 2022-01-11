FROM openjdk:8
ARG JAR_FILE=build/libs/*.jar
ENTRYPOINT ["java","-jar","/app.jar"]