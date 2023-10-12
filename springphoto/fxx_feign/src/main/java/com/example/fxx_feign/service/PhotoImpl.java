package com.example.fxx_feign.service;


import com.example.fxx_feign.entity.Image;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class PhotoImpl implements PhotoL{

    public ResponseEntity<String> load(@RequestParam("image") MultipartFile file) {
        return null;
    }
    public ResponseEntity<String> delete(@RequestBody Image image) {
        return null;
    }
    public ResponseEntity<String> search(@RequestParam("name") String name) {
        return null;
    }
    public ResponseEntity<String> update(@PathVariable("id") String imageId, @RequestParam("image") MultipartFile newImage) {
        return null;
    }
}
