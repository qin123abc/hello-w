package com.example.springboot_maven.utils;

import lombok.Data;

@Data
public class R {           //Result
    private Boolean flag;  //true false
    private Object data;   //
    private String msg;    //提示信息

    public R(){}

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

}
