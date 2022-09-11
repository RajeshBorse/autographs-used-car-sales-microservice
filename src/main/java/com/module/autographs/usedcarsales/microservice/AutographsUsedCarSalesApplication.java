package com.module.autographs.usedcarsales.microservice;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AutographsUsedCarSalesApplication {

    private static final Logger logger = LogManager.getLogger(AutographsUsedCarSalesApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(AutographsUsedCarSalesApplication.class, args);
        logger.info("Autographs Used Car Sales Microservices");

    }

    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI().info(apiInfo());
    }

    public Info apiInfo() {
        Info info = new Info();
        info.title("Autographs Used Car Sales Microservices API").description("Live Code System Swagger Open API").version("v1.0.0");
        return info;
    }

}
