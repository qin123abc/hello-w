package com.example.springboot_maven.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/rest")
//@RequestMapping(value = "/rest")
public class IndexRestController {

    @RequestMapping("/restIndex")
    public String rest(){
        return "index.html";
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public String get(){
        return "success";
    }

    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public String post(){
        return "success";
    }

    @RequestMapping(path = "/postOrGet", method = {RequestMethod.POST, RequestMethod.GET})
    public String postOrGet(){
        return "success";
    }

    // 该方法将接收 /user/login 发来的请求，且请求参数必须为 username=kolbe&password=123456
//    http://localhost:8083/rest/params?username=zhangsan&password=123456
    @RequestMapping(path = "/params", params={"username=zhangsan","password=123456"})
    public String params() {
        return "success";
    }


}
