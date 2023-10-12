package com.example.fxx_photo.config;

import com.example.fxx_photo.service.PhotoService;
import com.example.fxx_photo.service.PhotoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhotoBean {
    @Bean
    public PhotoService photoService() {
        return new PhotoServiceImpl();
    }

}
