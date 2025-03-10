package com.example.springboot_maven.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {
    private String bookName;
    private Double bookPrice;
    public Book(){
        System.out.println("创建book bean");
    }
}


