package com.sowhat.shakes.base.mode;

import java.io.Serializable;

/**
 * Created by liu on 2016/9/18.
 */
public class RoleInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String seq;
    private String roleId;
    private String roleName;

    public RoleInfo(){}

    public RoleInfo(String seq, String roleId, String roleName){
        this.seq = seq;
        this.roleId = roleId;
        this.roleName = roleName;
    }


    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
