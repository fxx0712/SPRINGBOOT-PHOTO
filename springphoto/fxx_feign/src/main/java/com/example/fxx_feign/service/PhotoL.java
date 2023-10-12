package com.example.fxx_feign.service;

import com.example.fxx_feign.config.FeignLog;
import com.example.fxx_feign.entity.Image;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
@FeignClient(name = "fxxphoto", url = "http://127.0.0.1:8081",configuration = FeignLog.class,fallback = PhotoImpl.class)
public interface PhotoL {
    @PostMapping("/load")
    ResponseEntity<String> load(@RequestParam("image") MultipartFile file);

    @PostMapping("/delete")
    ResponseEntity<String> delete(@RequestBody Image image);

    @PostMapping("/image/search")
    ResponseEntity<String> search(@RequestParam("name") String name);


    @PostMapping("/update/{id}")
    ResponseEntity<String> update(@PathVariable("id") String imageId, @RequestParam("image") MultipartFile newImage);

}
