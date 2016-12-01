package com.sowhat.shakes.admin.user.service;


import java.util.List;

import com.sowhat.shakes.base.mode.UserInfo;

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
     * userid 获取 user_info
     * @param userId
     * @return
     * @author liuyp
     */
    UserInfo getUserByUserId(String userId);
    /**
     * 添加更新用户
     * @param userInfo
     * @return
     */
    boolean saveOrUpdateUser(UserInfo userInfo);
}
