package com.inspur.demo.dao;

import com.inspur.demo.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by LTN on 2016/7/13.
 */
@Repository("userDao")
public interface IUserDao {
    void insertUser(User user);

    User selectByPrimaryKey(int userId);

    void updateUser(User user);
}
