package com.sowhat.shakes.admin.user.controller;

import com.google.gson.Gson;

import com.sowhat.shakes.admin.user.service.UserService;
import com.sowhat.shakes.base.mode.UserInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by liu on 2016/8/7.
 */
@Controller
@RequestMapping("/admin")
public class UserController {

    private Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loadUserList",produces = "text/plain;charset=UTF-8")
    public String loadUserListPage(){
        return "/admin/userList";
    }

    @ResponseBody
    @RequestMapping(value = "/getUserList",produces = "application/json;charset=UTF-8")
    public String getUserList( UserInfo userInfo){
        List<UserInfo> users = userService.getUserList(userInfo);
        Gson gson = new Gson();
        String usersJson = gson.toJson(users);
        return "{\"total\":"+ users.size()+ ",\"rows\":" +usersJson+ "}";
    }

    @RequestMapping(value = "/saveUser/{userInfo}")
    public String saveUser(@PathVariable("userInfo") UserInfo userInfo){
        boolean result = userService.saveOrUpdateUser(userInfo);
        Gson gson = new Gson();
        return gson.toJson(result);
    }


    /*****getter and setter******/

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
