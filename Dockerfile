FROM --platform=linux/amd64 openjdk:15
COPY  target/autographs-used-car-sales-microservice.jar autographs-used-car-sales-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-used-car-sales-microservice.jar"]
EXPOSE 8005