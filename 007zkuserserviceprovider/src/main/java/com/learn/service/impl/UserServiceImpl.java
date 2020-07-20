package com.learn.service.impl;

import com.learn.dubbo.model.User;
import com.learn.dubbo.service.UserService;

/**
 * @author wuminggao
 * @create 2020-07-20-下午4:08
 */
public class UserServiceImpl implements UserService {


    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setName(username);
        return user;
    }
}
