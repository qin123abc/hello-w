package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //告诉springboot这是一个mybatis的mapper类
//@Repository //讲userdao交给spring容器管理
public interface UserDao {

    //根据id查询user
    @Select("select * from user where id = #{id}")
    User getUserById(int id);

//    查询全部user
    @Select("select * from user")
    List<User> getAllUser();
    //插入一条user
    @Insert("insert into user values(null, #{username}, #{password})")
    int add(User user);
//    更新
    @Update("update user set username=#{username}, password=#{password} where id = #{id}")
    int update(User user);
//    删除
    @Delete("delete from user where id = #{id}")
    int delete(int id);
}
