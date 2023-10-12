package com.example.fxx_feign.service;

import com.example.fxx_feign.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserIpml implements UserL{

    public ResponseEntity<String> login(User user) {
        return null;
    }

    public ResponseEntity<String> register(User user) {
        return null;
    }

}
