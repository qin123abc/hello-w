package com.example.springboot_maven;

import com.example.springboot_maven.mapper.NewsDao;
import com.example.springboot_maven.pojo.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class NewsTest {

    @Autowired
    private NewsDao newsDao;

    @Test
    public void getNewsById(){
        News news = newsDao.getNewsById(1);
        System.out.println(news);
    }

    @Test
    public void getAllNews(){
        List<News> newsList = newsDao.getAllNews();
        System.out.println(newsList);
    }

    @Test
    public void insert(){
        News news = new News();
        news.setAuthor("王五");
        news.setTitle("标题3");
        newsDao.insert(news);
    }

    @Test
    public void add(){
        News news = new News();
        news.setAuthor("赵六");
        news.setTitle("标题4");
        newsDao.add(news);
    }

    @Test
    public void update(){
        News news = new News();
        news.setId(4);
        news.setAuthor("赵六六");
        news.setTitle("标题4");
        newsDao.update(news);
    }

    @Test
    public void delete(){
        newsDao.delete(4);
    }
}
