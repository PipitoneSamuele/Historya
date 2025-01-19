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
- Create Dockerfile (as written, without . at start)
  - Note: you can't create a folder, you have to put it at root level
- Create the Docker image with: docker build -t image_name .
  - This is the blueprint for creating a container
  - You can use the flag --no-cache to "force" a clean build
- Create container with: docker run -d -p 8080:8080 image_name

## Client

### Quickstart
- ng new project_name
- ng serve
  - Not working ng serve plain, i had to add --ssl

### Dockerize
- Create Dockerfile 
  - Expose port can be changed?
- Create the Docker image with: docker build -t image_name:tag . (same as microservice)
- Create container with: docker run -d -p 80:80 image_name

## Environment 
Now the objective is to have communication between client and microservices.
To do that I will use a Kubernetes cluster (Minikube).

### First time build
- minikube start
  - Useful to watch the cluster: minikube dashboard
- launch eval $(minikube docker-env) in every new bash
- build the docker images you need (this images will be loaded inside minikube, so you
won't have it locally)
- kubectl apply -f k8s.yaml (this is the file for the deployment, it will take
the previously builded image)

### Iterative developement
- make sure you are pointing at docker-env with command minikube status
- remove the image with
  - kubectl delete -f k8s.yaml
  - docker rmi image_name:tag
- rebuild and re-deploy with
  - docker build -t image_name:tag .
  - kubectl apply -f k8s.yaml

### Expose a service
- You need to have a deployment
- kubectl expose deployment deployment_name --type=NodePort --port=...
  - This step is not necessary, i've taken the yaml (with kubectl get deploy deployment_name -o yaml) of the service created and 
  i putted it inside k8s.yaml. So the next time i run apply it will automatically be created
- minikube service service_name --url
  - This will mantain the tunnel for the localhost, the terminal must stay open