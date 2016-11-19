package com.sowhat.shakes.admin.role.controller;
import com.google.gson.Gson;
import com.sowhat.shakes.admin.role.service.RoleService;
import com.sowhat.shakes.base.mode.RoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liu on 2016/9/18.
 */
@Controller
@RequestMapping("/admin")
public class RoleController {
    @Autowired
    private RoleService roleService;

    private static Gson gson = new Gson();

    @RequestMapping(value = "/saveRole/{roleInfo}",produces = "application/json;charset=UTF-8")
    public String saveRole(@PathVariable("roleInfo")RoleInfo roleInfo){
        return  gson.toJson(roleService.saveOrUpdateRoleInfo(roleInfo));
    }

    @RequestMapping(value = "/getRole/{seq}",produces = "application/json;charset=UTF-8")
    public String getRole(@PathVariable("seq") String seq){
        return gson.toJson(roleService.getRoleInfo(seq));
    }

}
