package com.example.springboot_maven;



import com.example.springboot_maven.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PropertiesTest {

    @Autowired
    private User user;


//    @Value("${server.port}")
//    private String port;

    @Test
    public void test01(){
//        String user1 = user.getUsername();
        System.out.println(user);
    }

//    @Test
//    public void getPort(){
//        System.out.println(port);
//    }




}
