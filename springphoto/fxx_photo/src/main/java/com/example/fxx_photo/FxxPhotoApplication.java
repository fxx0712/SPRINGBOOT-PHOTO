package com.example.fxx_photo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FxxPhotoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FxxPhotoApplication.class, args);
    }

}
