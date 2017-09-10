package com.inspur.demo.dao;

import com.inspur.demo.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by LTN on 2017/7/29.
 */
public class IUserDaoTest {

    private ApplicationContext ac = null;

    @Autowired
    IUserDao userDao;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userDao = (IUserDao) ac.getBean("userDao");
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserName(null);
        user.setAge(27);
        userDao.insertUser(user);
    }

    @Test
    public void testGet(){
        User user = userDao.selectByPrimaryKey(2);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setUserId(2);
        user.setUserName(null);
        user.setPassword(null);
        user.setAge(27);
        userDao.updateUser(user);
    }



}