package com.example.fxx_user.config;


import com.example.fxx_user.userService.UserService;
import com.example.fxx_user.userService.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

}

