package com.example.springboot_maven.controller;


import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/resp")  //http://localhost:8080/resp/hello
public class ResponseController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }

    @RequestMapping("/getNews")
    public News getNews(){
        News news = new News();
        news.setId(111);
        news.setTitle("aaa");
        news.setAuthor("bbb");
        return news;
    }

    @RequestMapping("/getlist")
    public List<News> getList(){
        News news = new News(111,"aaa","bbb");
        News news1 = new News(222,"test","张三");
        News news2 = new News(333,"木","一地一");

        List<News> lists = new ArrayList<>();
        List<User> lists1 = new ArrayList<>();
        lists.add(news);
        lists.add(news1);
        lists.add(news2);
        return lists;
    }


}
