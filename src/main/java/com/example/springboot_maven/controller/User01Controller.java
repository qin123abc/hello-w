package com.example.springboot_maven.controller;

import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.User01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user01")
public class User01Controller {

    @Autowired//依赖注入
//    @Resource
    private User01Service user01Service;

    @RequestMapping("/getUserById")
    public User getUserById(int id){
        User user = user01Service.getUserById(id);
        return user;
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return user01Service.getAllUser();
    }

}
