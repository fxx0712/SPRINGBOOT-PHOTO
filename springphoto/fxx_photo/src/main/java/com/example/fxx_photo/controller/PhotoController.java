package com.example.fxx_photo.controller;

import com.example.fxx_photo.dao.Dao;
import com.example.fxx_photo.entity.Image;
import com.example.fxx_photo.entity.ImageData;
import com.example.fxx_photo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:5500", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class PhotoController {

    private final PhotoService photoService;

    @Autowired
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @PostMapping("/upload")
    public ResponseEntity<?> handleFileUpload(@RequestParam("image") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                String destinationPath = "C:\\Users\\86135\\Desktop\\springphoto\\fxx_photo\\src\\main\\resources\\static\\img\\" + file.getOriginalFilename();
                File destinationFolder = new File("C:\\Users\\86135\\Desktop\\springphoto\\fxx_photo\\src\\main\\resources\\static\\img");
                destinationFolder.mkdirs(); // 创建文件夹
                file.transferTo(new File(destinationPath));
                Image image = new Image();
                image.setName(file.getOriginalFilename());
                image.setUrl("http://localhost:8081/images/"+file.getOriginalFilename());
                System.out.println("File saved successfully.");
                return ResponseEntity.ok(photoService.uploadImg(image));

            } catch (IOException e) {
                String errorMessage = "Error saving file: " + e.getMessage();
                System.out.println(errorMessage);
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
            }
        } else {
            String errorMessage = "No file uploaded.";
            System.out.println(errorMessage);
            return ResponseEntity.badRequest().body(errorMessage);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> hello(@RequestBody Image image){
        String deleteResult = photoService.deleteImg(image.getId());
        if (deleteResult != null) {
            System.out.println("hello test deleteResult");
            return ResponseEntity.ok("200");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/image/search")
    public ResponseEntity<List<Image>> searchImagesByName(@RequestParam("name") String name) {
        List<Image> images = photoService.searchImagesByName(name);
        if (!images.isEmpty()) {
            return ResponseEntity.ok(images);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

        @GetMapping("/")
        public List<Image> getAllImages() {
            System.out.println(photoService.getAllImages1());
         return photoService.getAllImages1();
    }

    @CrossOrigin(origins = "http://localhost:5500", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateImage(@PathVariable("id") String imageId, @RequestParam("image") MultipartFile newImage) {
        System.out.println("id"+imageId);
        System.out.println(newImage.getOriginalFilename());
        String destinationPath = "http://localhost:8081/images/" + newImage.getOriginalFilename();
        Image image = new Image();
        Long imgId = Long.parseLong(imageId);
        image.setId(imgId);
        image.setName(newImage.getOriginalFilename());
        image.setUrl(destinationPath);
        photoService.updateImage(image);
        return ResponseEntity.ok().build();
    }

}