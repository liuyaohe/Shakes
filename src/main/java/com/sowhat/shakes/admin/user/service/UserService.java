package com.sowhat.shakes.admin.user.service;


import com.sowhat.shakes.base.mode.UserInfo;

import java.util.List;

/**
 * Created by liu on 2016/8/7.
 */
public interface UserService {
    /**
     * 获取用户列表
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserList(UserInfo userInfo);

    /**
     * 添加更新用户
     * @param userInfo
     * @return
     */
    boolean saveOrUpdateUser(UserInfo userInfo);
}
