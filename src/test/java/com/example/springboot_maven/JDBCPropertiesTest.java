package com.example.springboot_maven;

import com.example.springboot_maven.pojo.JDBCProperties;
import com.example.springboot_maven.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JDBCPropertiesTest {

    @Autowired
    private JDBCProperties jdbcProperties;
    

    @Test
    public void test01(){
        System.out.println(jdbcProperties);
    }


}
