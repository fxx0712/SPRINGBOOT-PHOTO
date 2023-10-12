package com.example.fxx_photo.service;

import com.example.fxx_photo.dao.Dao;
import com.example.fxx_photo.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    Dao dao;

    @Override
    public Image uploadImg(Image image) {
        dao.insertImg(image.getName(), image.getUrl());
        return image;

    }

    @Override
    public List<Image> searchImagesByName(String name) {
        return dao.searchImagesByName(name);
    }

    @Override
    public Image updateImage(Image image) {
         dao.updateImage(image.getId(), image.getName(),image.getUrl());
         return null;

    }


    @Override
    public String deleteImg(long id) {
        dao.deleteImg(id);
        return "删除成功";
    }




    @Override
    public List<Image> getAllImages1() {
        return dao.getAllImages1();
    }

}
