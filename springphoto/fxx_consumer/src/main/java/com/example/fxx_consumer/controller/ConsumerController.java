package com.example.fxx_consumer.controller;



import com.example.fxx_feign.entity.Image;
import com.example.fxx_feign.entity.User;
import com.example.fxx_feign.service.PhotoL;
import com.example.fxx_feign.service.UserL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ConsumerController {

    @Autowired
    UserL userL;
    PhotoL photoL;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        return userL.register(user);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){
        return userL.login(user);
    }

    @PostMapping("/load")
    public ResponseEntity<String> load(@RequestParam("image") MultipartFile file){
        return  photoL.load(file);
    }
    @PostMapping("/delet")
    public ResponseEntity<String> delete(@RequestBody Image image){
        return  photoL.delete(image);
    }
    @PostMapping("/image/search")
    public ResponseEntity<String> search(@RequestParam("name") String name){
        return  photoL.search(name);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable("id") String imageId, @RequestParam("image") MultipartFile newImage){
        return  photoL.update(imageId,newImage);
    }
}

