package com.example.fxx_feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignLog {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
