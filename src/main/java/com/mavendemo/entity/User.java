package com.mavendemo.entity;

import org.springframework.stereotype.Component;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 19:31
 **/

@Component
public class User {

    private int id;
    private String name;
    private String password;

    public User(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
