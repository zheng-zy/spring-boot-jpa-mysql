package com.demo.me.service;

import com.demo.me.dao.RoleDao;
import com.demo.me.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */
@Service
public class RoleService {

    @Resource
    private RoleDao roleDao;

    public List<Role> findRolesByUserId(Long id) {
        return roleDao.findRolesByUserId(id);
    }

}
