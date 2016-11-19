package com.sowhat.shakes.base.mode;

import java.io.Serializable;

/**
 * 用户类
 * Created by liu on 2016/8/7.
 */
public class UserInfo implements Serializable {
    private String id;
    private String name;
    private String password;
    private String mobile;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
