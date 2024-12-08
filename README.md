# Historya

## Scope
Personal project about history. The main objective is to learn tools and apply some ideas to a potentially infinite project, meanwhile it would be good to learn some history.

## Microservices

### Quickstart
- Spring Initializr: create with base configuration, then add the base maven dependencies, like:
  - Spring Boot Starter Web
- Create first controller
- For launching it in localhost use the command ./mvnw spring-boot:run
  - Note: no hot reload, when you make a change you should restart the localhost server

### Dockerize
- Create the jar package
  - ./mvnw package
  - to test it: java -jar target/JAR_name-JAR_version.jar
- Create Dockerfile under docker folder
- Create the Docker image with: docker build -t name . 