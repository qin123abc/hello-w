package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsDao {

    News getNewsById(int id);

    List<News> getAllNews();

    int insert(News news);

    int add(News news);

    int update(News news);

    int delete(int id);
}
