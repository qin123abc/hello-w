package com.example.springboot_maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_maven.mapper")
public class SpringBootMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMavenApplication.class, args);
    }

}
