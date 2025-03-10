package com.example.springboot_maven.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test03 {

    public static void main(String[] args) throws Exception{
        //获取数据库连接对象

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zyg","root","123456");
        //定义sql语句
        String sql = "select * from zyg.user";
        //获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        //执行sql
        ResultSet resultSet = stmt.executeQuery(sql);
        //处理结果
        while(resultSet.next()) {
            int id = resultSet.getInt(1);                    //获取id
            String name = resultSet.getString("username");             //获取姓名
            System.out.println("id:" + id + " name:" + name);
        }
        //释放资源
        stmt.close();
        conn.close();
    }



}
