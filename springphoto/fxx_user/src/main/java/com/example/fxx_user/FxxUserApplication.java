package com.example.fxx_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FxxUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(FxxUserApplication.class, args);
    }

}
