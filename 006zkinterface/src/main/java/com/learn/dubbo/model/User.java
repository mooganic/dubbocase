package com.learn.dubbo.model;

import java.io.Serializable;

/**
 * @author wuminggao
 * @create 2020-07-20-下午4:01
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6849794231546720L;

    private String name;

    private Integer id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
