package com.example.springboot_maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 了解@Controller用法以及特点
 */
@Controller
public class HelloController {


    /**
     * 返回页面
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "index.html";
    }

    /**
     * 返回字符串
     *
     * @ResponseBody可以放在类上也是放在方法上
     * 放在类上面是当前类都返回查询到的数据
     * 放在方法上当前方返回查询到的数据
     * @return
     */
    @RequestMapping(value = "/index1")
    @ResponseBody
    public String index1(){
        return "index.html";
    }


}

