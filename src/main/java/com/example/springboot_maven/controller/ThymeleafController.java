package com.example.springboot_maven.controller;

import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.NewService;
import com.example.springboot_maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/thyme")
public class ThymeleafController {
    @RequestMapping("/demo1")
    public String demo1(){
        System.out.println("demo1");
        return "demo1";
    }
    @RequestMapping("/demo2")
    public String demo2(Model model){
        System.out.println("demo2");
        model.addAttribute("thyme", "传递thyme");
        return "demo2";
          }
    @RequestMapping("/demo3")
    public String demo3(HttpServletRequest request, Model model){
        String name = "zhangsan";
        int age = 18;
        String content ="<a href='http://www.baidu.com'>百度</a>";
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        request.setAttribute("content", content);
        return "demo3";
    }
    @Autowired
    private NewService newService;
    @Autowired
    private UserService userService;
    @RequestMapping("/demo4")
    public String demo4(Model model, int id){
        User user = userService.getUserById(id);
        News news = newService.getNewsById(id);
        model.addAttribute("user", user);
        model.addAttribute("news", news);
        return "demo4";
    }
    @RequestMapping("/demo5")
    public String demo5(HttpServletRequest request){
        List<User> userList = userService.getAllUser();
        request.setAttribute("userList", userList);
        return "demo5";
    }
    @RequestMapping("/demo6")
    public String demo6(HttpSession session){
        String name = "xiaoming";
        session.setAttribute("name",name);
        return "demo6";
    }

}
