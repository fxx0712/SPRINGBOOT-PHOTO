package com.example.fxx_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class FxxZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(FxxZuulApplication.class, args);
    }

}
