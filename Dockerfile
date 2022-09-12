FROM openjdk:15
ADD target/autographs-used-car-sales-microservice.jar autographs-used-car-sales-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-used-car-sales-microservice.jar"]
EXPOSE 8005