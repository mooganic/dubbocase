package com.learn.dubbo.service.impl;

import com.learn.dubbo.model.User;
import com.learn.dubbo.service.UserService;

/**
 * @author wuminggao
 * @create 2020-07-20-下午5:46
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setName(username+"-1");
        user.setId(id);
        return user;
    }
}
