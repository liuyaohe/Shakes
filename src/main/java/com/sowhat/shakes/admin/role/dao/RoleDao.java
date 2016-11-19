package com.sowhat.shakes.admin.role.dao;


import com.sowhat.shakes.base.mode.RoleInfo;

import java.util.List;

/**
 * Created by liu on 2016/9/18.
 */
public interface RoleDao {
    /**
     * 保存
     * @param roleInfo
     * @return
     */
    boolean saveRoleInfo(RoleInfo roleInfo);

    /**
     * 修改
     * @param roleInfo
     * @return
     */
    boolean updateRoleInfo(RoleInfo roleInfo);

    /**
     * 获取
     * @param roleInfo
     * @return
     */
    List<RoleInfo> getRoleInfos(RoleInfo roleInfo);

    /**
     * 获取单个
     * @param key
     * @return
     */
    RoleInfo getRoleInfo(String key);

    /**
     * 删除
     * @param roleInfo
     */
    void  delRoleInfo(RoleInfo roleInfo);

    /**
     * 删除
     * @param roleInfos
     */
    void delRoleInfos(List<RoleInfo> roleInfos);
}
