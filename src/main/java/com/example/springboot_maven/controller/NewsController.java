package com.example.springboot_maven.controller;

import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewService newService;

    @RequestMapping("/getNewsById")
    private News getNewsById(int id){
        News news = newService.getNewsById(id);
        return news;
    }

    @RequestMapping("/getAllNews")
    public List<News> getAllUser(){
        List<News> userList = newService.getAllNews();
        return userList;
    }

    @RequestMapping("/insertNews")
    public int insertNews(@RequestBody News news){
        return newService.insertNews(news);
    }

    @RequestMapping("/addNews")
    public int addUser(@RequestBody News news){
        return newService.add(news);
    }

    @RequestMapping("/updateNews")
    public int updateUser(@RequestBody News news){
        return newService.update(news);
    }

    @RequestMapping("/deleteNewsById")
    public int deleteUserById(int id){
        return newService.delete(id);
    }
}
