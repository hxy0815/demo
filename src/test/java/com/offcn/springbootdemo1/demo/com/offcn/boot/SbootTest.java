package com.offcn.springbootdemo1.demo.com.offcn.boot;

import com.offcn.springbootdemo1.demo.DemoApplication;
import com.offcn.springbootdemo1.demo.mapper.UserMapper;
import com.offcn.springbootdemo1.demo.pojo.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SbootTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getUserList(){
        List<MUser> userList = userMapper.getUserList();
        for (MUser user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void getredis(){
        redisTemplate.opsForValue().set("a","b");
        String str = (String)redisTemplate.opsForValue().get("a");
        System.out.println(str);
    }
}
