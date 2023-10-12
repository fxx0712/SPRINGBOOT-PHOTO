package com.example.fxx_user.userController;

import com.example.fxx_user.entity.User;
import com.example.fxx_user.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5500", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        boolean isRegistered = userService.register(user);

        if (isRegistered) {
            // 用户注册成功
            return ResponseEntity.ok("Registration successful");
        } else {
            // 用户注册失败
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username is already taken");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User loggedInUser = userService.login(user);

        if (loggedInUser != null) {
            // 用户登录成功
            return ResponseEntity.ok("Login successful");
        } else {
            // 用户登录失败
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }
}
