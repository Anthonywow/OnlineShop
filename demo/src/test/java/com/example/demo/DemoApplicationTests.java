package com.example.demo;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.demo.dao")
public class DemoApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        UserExample userExample = new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        for(User s : users){
           System.out.println(s.toString());
     }

    }

}
