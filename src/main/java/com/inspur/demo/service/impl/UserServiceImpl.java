package com.inspur.demo.service.impl;

import com.inspur.demo.dao.IUserDao;
import com.inspur.demo.pojo.User;
import com.inspur.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LTN on 2016/7/13.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}