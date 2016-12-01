package com.sowhat.shakes.admin.user.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sowhat.shakes.base.mode.UserInfo;

/**
 * Created by liu on 2016/9/30.
 */
@Component
public interface UserMapper {

    /**
     * 保存用户
     * @param userInfo
     */
    void insertUser(UserInfo userInfo);

    /**
     * 更新用户信息
     * @param userInfo
     */
    void updateUser(UserInfo userInfo);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(String id);


    /**
     * 查询用户
     * @param id
     */
    UserInfo findBySeq(String seq);
    
    /**
     * 查询用户
     * @param userId
     * @return
     * @author liuyp
     */
    UserInfo findByUserId(String userId);

    /**
     * 查询用户列表
     * @param userInfo
     * @return
     */
    List<UserInfo> find(UserInfo userInfo);

}
