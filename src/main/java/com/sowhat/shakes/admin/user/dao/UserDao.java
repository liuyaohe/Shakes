package com.sowhat.shakes.admin.user.dao;


import com.sowhat.shakes.base.mode.UserInfo;

import java.util.List;

/**
 * Created by liu on 2016/8/7.
 */
public interface UserDao {
    /**
     * 获取用户列表
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserList(UserInfo userInfo);

    /**
     * 通过id 获取 user
     * @param id
     * @return
     */
    UserInfo getUser(String id);

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    UserInfo saveUserInfo(UserInfo userInfo);

    /**
     * 修改用户
     * @param userInfo
     * @return
     */
    UserInfo updateUserInfo(UserInfo userInfo);
}
