package com.wkcto.dubbo.service;

import com.wkcto.dubbo.model.User;

/**
 * @author wuminggao
 * @create 2020-07-19-下午10:38
 */
public interface UserService {

    /**
     * 根据用户id获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
