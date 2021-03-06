package com.gao.entity;

import java.io.Serializable;

/**
 * @Author gs
 * @Date created time 2019/5/11 17:48
 * @Description
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
