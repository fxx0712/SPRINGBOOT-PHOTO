package com.example.fxx_user.userService;


import com.example.fxx_user.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User login(User user);
    boolean register(User user);
}
