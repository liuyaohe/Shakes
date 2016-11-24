package com.sowhat.shakes.admin.login.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liu on 2016/8/13.
 */
@Controller
@RequestMapping("/admin")
public class LoginController {
    Log log = LogFactory.getLog(LoginController.class);

    @RequestMapping("/login")
    public String login(){
        log.info("====正在登陆===");
        return "/admin/login";
    }

    @RequestMapping("/logout")
    public String logout(){
        log.info("注销登录");
        return null;
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        log.info("====测试页面===");
        return new ModelAndView("/index");
    }
    @RequestMapping(value = "/head")
    public String head(){
        return "/components/head";
    }
    @RequestMapping(value = "/foot")
    public String foot(){
        return "/components/foot";
    }
}
