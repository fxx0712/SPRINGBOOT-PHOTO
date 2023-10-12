package com.example.fxx_user.Dao;

import com.example.fxx_user.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Dao {
    @Select("select * from user where username = #{username} and password = #{password}")
    User Log(@Param("username") String username, @Param("password") String password);

    @Insert("insert into user (username, password) values (#{username}, #{password})")
    void register(@Param("username") String username, @Param("password") String password);
}
