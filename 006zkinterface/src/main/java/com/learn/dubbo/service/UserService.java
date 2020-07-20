package com.learn.dubbo.service;

import com.learn.dubbo.model.User;

/**
 * @author wuminggao
 * @create 2020-07-20-下午4:03
 */
public interface UserService {

    User queryUserById(Integer id, String username);
}
