package com.demo.me.dao;

import com.demo.me.entity.Role;

import java.util.List;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */
public interface RoleDao {

    List<Role> findRolesByUserId(Long id);

}
