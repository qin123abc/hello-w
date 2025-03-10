package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface User01Dao {

    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    @Select("select * from user")
    List<User> getAllUser();

}
