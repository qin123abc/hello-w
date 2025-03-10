package com.example.springboot_maven.service.impl;

import com.example.springboot_maven.mapper.UserDao;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setUsername("zhangsan");
        return user;
    }

    @Override
    public User getUserById(int id) {
        User user = userDao.getUserById(id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = userDao.getAllUser();
        return userList;
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }


}
