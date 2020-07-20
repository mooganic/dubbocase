package com.wkcto.dubbo.model;

import java.io.Serializable;

/**
 * @author wuminggao
 * @create 2020-07-20-上午11:00
 */
public class User implements Serializable {
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
