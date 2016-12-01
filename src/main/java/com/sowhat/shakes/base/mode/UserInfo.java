package com.sowhat.shakes.base.mode;

import java.io.Serializable;

/**
 * 用户类
 * Created by liu on 2016/8/7.
 */
public class UserInfo implements Serializable {
    private String seq;
    private String userId;//登录id
    private String name;// 用户名
    private String password;//密码
    private String mobile;//手机号
    
    private RoleInfo roleInfo;//角色

    public String getSeq() {
		return seq;
	}
    
    public void setSeq(String seq) {
		this.seq = seq;
	}

    public String getUserId() {
		return userId;
	}
    
    public void setUserId(String userId) {
		this.userId = userId;
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
    
    public RoleInfo getRoleInfo() {
		return roleInfo;
	}
    public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}
}
