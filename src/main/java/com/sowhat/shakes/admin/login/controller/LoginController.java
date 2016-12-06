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

public class LoginController {
    Log log = LogFactory.getLog(LoginController.class);

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        log.info("====跳转到登录页面===");
        return "/admin/login";
    }

    /**
     * 登录认证
     * @return
     */
    @RequestMapping("/loginCheck")
    public String loginCheck(){
    	
        log.info("===登录成功===");
        return "成功";
    }

    /**
     * 退出系统
     * @return
     * @author liuyp
     */
    @RequestMapping("/logout")
    public String logout(){
        log.info("注销登录");
        return null;
    }

    /**
     * 主页地址
     * @return
     * @author liuyp
     */
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        log.info("====测试页面===");
        return new ModelAndView("/index");
    }
    /**
     * 页面头部
     * @return
     * @author liuyp
     */
    @RequestMapping(value = "/head")
    public String head(){
        return "/components/head";
    }
    
    /**
     * 页面底部
     * @return
     * @author liuyp
     */
    @RequestMapping(value = "/foot")
    public String foot(){
        return "/components/foot";
    }
}
