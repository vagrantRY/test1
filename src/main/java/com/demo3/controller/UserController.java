package com.demo3.controller;

import com.alibaba.fastjson.JSON;
import com.demo3.mapper.UserMapper;
import com.demo3.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("queryUser")
    public String queryUser(){
       List<User> list= userMapper.selectUser();
       String str= JSON.toJSONString(list);
        return str;
    }
}
