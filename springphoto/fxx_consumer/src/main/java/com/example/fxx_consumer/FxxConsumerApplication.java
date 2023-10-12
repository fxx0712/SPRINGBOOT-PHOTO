package com.example.fxx_consumer;

import com.example.fxx_feign.config.FeignLog;
import com.example.fxx_feign.service.PhotoL;
import com.example.fxx_feign.service.UserL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@EnableFeignClients(clients ={UserL.class,PhotoL.class},defaultConfiguration = {FeignLog.class})
@ComponentScan({"com.example.fxx_feign.service","com.example.fxx_consumer"})
@SpringBootApplication

public class FxxConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FxxConsumerApplication.class, args);
    }

}
