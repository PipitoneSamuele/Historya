FROM openjdk:17-jdk-alpine

COPY target/*.jar facts.jar

ENTRYPOINT ["java","-jar","/facts.jar"]