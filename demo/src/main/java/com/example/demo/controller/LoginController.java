package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/gjy")
public class LoginController {
    @Autowired
    UserMapper userMapper;
    Map<String, Object> map = new HashMap();

    @PostMapping(value = "/login_check")
    public Map<String, Object> login(String username, String password, HttpSession session){
        UserExample userExample = new UserExample();    //表示全部对象
        userExample.or().andUsernameEqualTo(username);  //根据名字获取数据
        User user = userMapper.selectByExample(userExample).get(0);    //获取第一个对象

        if(user.getPassword().equals(password)){
            map.put("success", true);
            map.put("username", username);
            session.setAttribute("username",user.getUsername());
        }
        else {
            map.put("errmessage", "密码错误");
            map.put("success", false);
        }
        return map;
    }

    @GetMapping(value = "/user_lock")
    public User userlock(HttpSession session){
        String username = (String)session.getAttribute("username");
        if(username == null){
            User user = new User();
            user.setUsername("0000");
            return user;
        }
        else{
            UserExample userExample = new UserExample();    //表示全部对象
            userExample.or().andUsernameEqualTo(username);  //根据名字获取数据
            User userr = userMapper.selectByExample(userExample).get(0);    //获取第一个对象
            return userr;
        }
    }

    @PostMapping(value = "/register_check")
    public Map<String,Object> register(String username,String password){
        UserExample userExample = new UserExample();    //表示全部对象
        userExample.or().andUsernameEqualTo(username);  //根据名字获取数据
        if( userMapper.selectByExample(userExample)== null){
            map.put("errmessage", "用户已被注册");
            map.put("success", false);
        }
        else {
            map.put("success", true);
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            userMapper.insert(user);
        }
        return map;
    }
}
