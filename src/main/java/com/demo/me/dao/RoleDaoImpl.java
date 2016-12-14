package com.demo.me.dao;

import com.alibaba.fastjson.JSON;
import com.demo.me.entity.Role;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */

@Component
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> findRolesByUserId(Long id) {
        String sql = "select b.* from tbl_users a left join tbl_roles b on a.id = b.user_id where a.id = :id";
        List roles = entityManager.createNativeQuery(sql, Role.class).setParameter("id", id).getResultList();
        System.out.println("JSON.toJSONString(roles) = " + JSON.toJSONString(roles));
        return roles;
    }
}
