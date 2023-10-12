package com.example.fxx_feign.service;

import com.example.fxx_feign.config.FeignLog;
import com.example.fxx_feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "fxxuser", url = "http://127.0.0.1:8082",configuration = FeignLog.class,fallback = UserIpml.class)
public interface UserL {
    @PostMapping("/login")
     ResponseEntity<String> login(@RequestBody User user);

    @PostMapping("/register")
     ResponseEntity<String> register(@RequestBody User user);

}
