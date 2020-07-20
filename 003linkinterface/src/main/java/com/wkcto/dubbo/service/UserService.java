package com.wkcto.dubbo.service;

import com.wkcto.dubbo.model.User;

/**
 * @author wuminggao
 * @create 2020-07-20-上午11:01
 */
public interface UserService {

    /**
     * 根据用户标识获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);

    /**
     * 查询用户总人数
     * @return
     */
    Integer queryAllUserCount();
}
