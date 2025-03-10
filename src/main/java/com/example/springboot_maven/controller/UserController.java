package com.example.springboot_maven.controller;

import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired//依赖注入
    private UserService userService;


    @RequestMapping("/getUser")
    public User getUser(Integer id){

        User user = userService.getUser(id);
        return user;
    }


    @RequestMapping("/getUserById")
    public User getUserById(int id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> userList = userService.getAllUser();
        return userList;
    }


    @RequestMapping("/addUser")
    public int addUser(@RequestBody User user){
        return userService.add(user);
    }

    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping("/deleteUserById")
    public int deleteUserById(int id){
        return userService.delete(id);
    }
}
