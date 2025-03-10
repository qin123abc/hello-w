package com.example.springboot_maven.pojo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private int id;
    private String username;
    private String password;
    private Integer age;
    private Book book;
    private News news;
    private Date birth;
    private String[] hobby;
    private List<String> booksName;
    private Map<String, Object> books;
    private Set<Double> salary;



}

