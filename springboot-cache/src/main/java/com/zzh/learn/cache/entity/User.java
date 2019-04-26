package com.zzh.learn.cache.entity;

import java.io.Serializable;

/**
 * @author zhuhao
 * @title: User
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/123:34 PM
 */
public class User implements Serializable {

    private String id;

    private String name;

    public User() {

    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
