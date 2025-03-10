package com.example.springboot_maven;

import com.example.springboot_maven.mapper.UserDao;
import com.example.springboot_maven.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MybatisTest {

//    @Autowired
    @Resource//依赖注入
    private UserDao userDao;

    @Test
    public void getUserById(){
        User user = userDao.getUserById(2);
        System.out.println(user);
    }

    @Test
    public void getAll(){
        List<User> userList = userDao.getAllUser();
        System.out.println(userList);
    }

    @Test
    public void insert(){
        User user = new User();
        user.setUsername("王五");
        user.setPassword("12345");
        userDao.add(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(3);
        user.setUsername("王五wu");
        user.setPassword("123456");
        userDao.update(user);
    }

    @Test
    public void delete(){
        userDao.delete(3);
    }
}
