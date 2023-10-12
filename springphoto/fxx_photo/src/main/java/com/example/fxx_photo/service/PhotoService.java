package com.example.fxx_photo.service;

import com.example.fxx_photo.entity.Image;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface PhotoService {
   Image uploadImg(Image image);
   String deleteImg(long id);
   List<Image> getAllImages1();
   List<Image> searchImagesByName(String name);
   Image updateImage(Image image);
}
