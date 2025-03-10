package com.example.springboot_maven.service;

import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.pojo.User;

import java.util.List;

public interface NewService {


    List<News> getNewsList();

    News getNewsById(int id);

    List<News> getAllNews();

    int insertNews(News news);

    int add(News news);

    int update(News news);

    int delete(int id);
}
