package com.sowhat.shakes.admin.user.service.impl;


import com.sowhat.shakes.admin.user.dao.UserDao;
import com.sowhat.shakes.admin.user.service.UserService;
import com.sowhat.shakes.base.mode.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


import java.util.List;

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

    public boolean saveOrUpdateUser(UserInfo userInfo) {
        UserInfo result = null;
        if(StringUtils.isEmpty(userInfo.getId())){
           result = userDao.saveUserInfo(userInfo);
        }else {
           result = userDao.updateUserInfo(userInfo);
        }
        return result != null;
    }

    /*********getter and setter***********/
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


}
