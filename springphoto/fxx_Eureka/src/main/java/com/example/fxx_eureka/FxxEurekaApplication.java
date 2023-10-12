package com.example.fxx_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FxxEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FxxEurekaApplication.class, args);
    }

}
