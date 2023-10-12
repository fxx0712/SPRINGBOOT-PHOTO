package com.example.fxx_photo.dao;

import com.example.fxx_photo.entity.Image;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Dao {
    @Insert("INSERT INTO getphoto (photoname, url) VALUES (#{photoname}, #{url})")
    void insertImg(@Param("photoname") String photoname, @Param("url") String url);

    @Delete("DELETE FROM getphoto WHERE id = #{id}")
    void deleteImg(@Param("id") Long id);

    @Update("UPDATE getphoto SET photoname = #{photoname}, url = #{url} WHERE id = #{id}")
    void updateImage(@Param("id") Long id, @Param("photoname") String photoname, @Param("url") String url);

    @Select("SELECT * FROM getphoto ")
    List<Image> getAllImages1();

    @Select("SELECT * FROM getphoto WHERE photoname = #{name}")
    List<Image> searchImagesByName(@Param("name") String name);
}
