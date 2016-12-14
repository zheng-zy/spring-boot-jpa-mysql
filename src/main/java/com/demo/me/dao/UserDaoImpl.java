package com.demo.me.dao;


import com.alibaba.fastjson.JSON;
import com.demo.me.entity.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */
@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void find() {
        String sql = "select a.* from tbl_users a where a.id = :id";
        Query query = entityManager.createNativeQuery(sql, User.class).setParameter("id", 1);
        User user = (User) query.getSingleResult();
        System.out.println("JSON.toJSONString(user) = " + JSON.toJSONString(user));
    }
}
