package com.example.springboot_maven;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class EnvironmentTest {

    @Autowired
    private Environment environment;

    @Test
    public void environmentTest(){
        String property = environment.getProperty("user.username");
        String property1 = environment.getProperty("user.hobby");
        String property2 = environment.getProperty("user.booksname");
        System.out.println(property);
        System.out.println(property1);
        System.out.println(property2);
    }
}
