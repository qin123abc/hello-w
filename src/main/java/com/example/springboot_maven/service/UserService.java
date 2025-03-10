package com.example.springboot_maven.service;

import com.example.springboot_maven.pojo.User;

import java.util.List;

public interface UserService {

    User getUser(Integer id);

    User getUserById(int id);

    List<User> getAllUser();

    int add(User user);

    int update(User user);

    int delete(int id);
}
