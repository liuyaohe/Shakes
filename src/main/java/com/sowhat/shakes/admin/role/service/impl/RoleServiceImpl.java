package com.sowhat.shakes.admin.role.service.impl;


import com.sowhat.shakes.admin.role.dao.RoleDao;
import com.sowhat.shakes.admin.role.service.RoleService;
import com.sowhat.shakes.base.mode.RoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by liu on 2016/9/18.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;


    public boolean saveOrUpdateRoleInfo(RoleInfo roleInfo) {
        boolean result ;
        if(StringUtils.isEmpty(roleInfo.getSeq())){
            result = roleDao.saveRoleInfo(roleInfo);
        }else {
            result = roleDao.updateRoleInfo(roleInfo);
        }
        return result;
    }


    public RoleInfo getRoleInfo(String seq) {
        return roleDao.getRoleInfo(seq);
    }
}
