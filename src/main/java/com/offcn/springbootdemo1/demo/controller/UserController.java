package com.offcn.springbootdemo1.demo.controller;

import com.offcn.springbootdemo1.demo.dao.UserDao;
import com.offcn.springbootdemo1.demo.entity.User;
import com.offcn.springbootdemo1.demo.mapper.UserMapper;
import com.offcn.springbootdemo1.demo.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/list")
    public List<User> showUserList(){
        return userDao.findAll();
    }

    @RequestMapping("/user/list3")
    public List<MUser> getUserList(){
        return userMapper.getUserList();
    }
}
