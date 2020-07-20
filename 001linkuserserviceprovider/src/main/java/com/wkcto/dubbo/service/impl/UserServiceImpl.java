package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

/**
 * @author wuminggao
 * @create 2020-07-19-下午10:39
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("lisi");
        user.setAge(20);
        return user;
    }
}
