package com.example.springboot_maven.controller;


import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/req")
public class RequestController {

    @RequestMapping("/sim1")
    public String simpleParam(HttpServletRequest request){
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        return name+":"+age;
    }

    @RequestMapping("/sim2")
    public String simpleParam2(String name,int age){
        return name+":"+age;
    }

    @RequestMapping(value = "/sim3")
    public String simpleParam3(@RequestParam(name="name") String username, int age){
        return username+":"+age;
    }

    @RequestMapping("/sim5")
    public String simpleParam5(@RequestParam(name="name",required = false) String username, int age){
        return username+":"+age;
    }

    @RequestMapping("/simPojo1")
    public String simplePojo1(News news){
        System.out.println(news);
        return news.toString();
    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return user.toString();
    }



    @RequestMapping("/arrayParam")
    public String arrayPojo1(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return Arrays.toString(hobby);
    }

    @RequestMapping("/listParam")
    public String listPojo(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return hobby.toString();
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime){
        System.out.println(updateTime);
        return updateTime.toString();
    }
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return id.toString();
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+":"+name);
        return id.toString()+":"+name;
    }



}
