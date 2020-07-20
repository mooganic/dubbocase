package com.wkcto.dubbo.model;

import java.io.Serializable;

/**
 * @author wuminggao
 * @create 2020-07-19-下午10:37
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6849799123073127710L;

    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
