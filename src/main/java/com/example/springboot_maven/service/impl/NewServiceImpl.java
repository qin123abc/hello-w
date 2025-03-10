package com.example.springboot_maven.service.impl;

import com.example.springboot_maven.mapper.NewsDao;
import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewServiceImpl implements NewService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> getNewsList() {
        News news = new News(111,"aaa","bbb");
        News news1 = new News(222,"test","张三");
        News news2 = new News(333,"木","一地一");
        List<News> lists = new ArrayList<>();
        lists.add(news);
        lists.add(news1);
        lists.add(news2);
        return lists;
    }

    @Override
    public News getNewsById(int id) {
//        News news = new News();
//        news.setId(id);
//        news.setTitle("标题1");
//        news.setAuthor("zhangsan");
//        return news;
        return newsDao.getNewsById(id);
    }


    @Override
    public List<News> getAllNews() {
        return newsDao.getAllNews();
    }

    @Override
    public int insertNews(News news) {
        return newsDao.insert(news);
    }

    @Override
    public int add(News news) {
        return newsDao.add(news);
    }

    @Override
    public int update(News news) {
        return newsDao.update(news);
    }

    @Override
    public int delete(int id) {
        return newsDao.delete(id);
    }


}
