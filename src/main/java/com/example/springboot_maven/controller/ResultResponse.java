package com.example.springboot_maven.controller;


import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultResponse {

    @RequestMapping("/hello")
    public R hello(){
        return new R(true,"hello spring boot");
    }

    @RequestMapping("/getNews")
    public R getNews(){
        News news = new News();
        news.setId(111);
        news.setTitle("aaa");
        news.setAuthor("bbb");
        return new R(true,news);
    }

    @RequestMapping("/getlist")
    public R getList(){
        News news = new News(111,"aaa","bbb");
        News news1 = new News(222,"test","张三");
        News news2 = new News(333,"木","一地一");
        List<News> lists = new ArrayList<>();
        lists.add(news);
        lists.add(news1);
        lists.add(news2);
        return new R(true,lists,"成功");
    }

    @RequestMapping("/error")
    public R error(){
        return new R(false,null,"系统正在忙碌");
    }
}
