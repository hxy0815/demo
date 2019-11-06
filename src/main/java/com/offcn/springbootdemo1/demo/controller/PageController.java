package com.offcn.springbootdemo1.demo.controller;

import com.offcn.springbootdemo1.demo.dao.UserDao;
import com.offcn.springbootdemo1.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PageController {

    @Autowired
    private UserDao userDao;

    @Value("${page.rows}")
    private Integer rows;

    @RequestMapping("/page/user/list")
    public String showUserList(Model model){
        List<User> list = userDao.findAll();
        model.addAttribute("userList",list);
        System.out.println(list);
        return "user";
    }

    @RequestMapping("/page/rows")
    @ResponseBody
    public Map showRows(){
        Map map = new HashMap();
        map.put("rows",rows);
        return map;
    }
}
