package com.example.springboot_maven.service.impl;

import com.example.springboot_maven.mapper.User01Dao;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.User01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User01ServiceImpl implements User01Service {

    @Autowired
    private User01Dao user01Dao;

    @Override
    public User getUserById(int id) {


//        User user = new User();
//        user.setId(id);
//        user.setUsername("zhangsan");
//        user.setPassword("1234567");
//
//        System.out.println(user.getId());
//        System.out.println(user.getUsername());
//
//        return user;
        User user = user01Dao.getUserById(id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = user01Dao.getAllUser();
        return userList;
    }
}
