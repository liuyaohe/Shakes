package com.sowhat.shakes.admin.role.service;


import com.sowhat.shakes.base.mode.RoleInfo;

/**
 * Created by liu on 2016/9/18.
 */
public interface RoleService {
    /**
     * 保存更新用户
     * @param roleInfo
     * @return
     */
    boolean saveOrUpdateRoleInfo(RoleInfo roleInfo);

    /**
     * 根据seq获取角色信息
     * @param seq
     * @return RoleInfo
     */
    RoleInfo getRoleInfo(String seq);

}
