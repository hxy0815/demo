package com.offcn.springbootdemo1.demo.dao;

import com.offcn.springbootdemo1.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
