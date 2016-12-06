package com.sowhat.shakes.admin.user.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sowhat.shakes.admin.user.dao.UserDao;
import com.sowhat.shakes.admin.user.service.UserService;
import com.sowhat.shakes.base.mode.UserInfo;

/**
 * Created by liu on 2016/8/7.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public List<UserInfo> getUserList(UserInfo userInfo) {
        return userDao.getUserList(userInfo);
    }
    
    @Override
    public UserInfo getUserByUserId(String userId) {
    	return userDao.getUserByUserId(userId);
    }

    public boolean saveOrUpdateUser(UserInfo userInfo) {
        if(StringUtils.isEmpty(userInfo.getSeq())){
           userDao.saveUserInfo(userInfo);
        }else {
           userDao.updateUserInfo(userInfo);
        }
        return true;
    }

    /*********getter and setter***********/
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


}
