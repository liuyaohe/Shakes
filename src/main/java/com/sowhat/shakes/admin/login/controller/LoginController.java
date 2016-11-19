package com.sowhat.shakes.admin.login.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liu on 2016/8/13.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    Log log = LogFactory.getLog(LoginController.class);


    @RequestMapping("/login")
    public String login(){
        log.info("====正在登陆===");
        return "success";
    }

    @RequestMapping("/logout")
    public String logout(){
        log.info("注销登录");
        return null;
    }

    @RequestMapping("/index")
    public String index(){
        log.info("====测试页面===");
        return "/index";
    }
}
