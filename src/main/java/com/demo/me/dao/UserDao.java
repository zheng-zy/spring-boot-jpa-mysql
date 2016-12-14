package com.demo.me.dao;

import com.demo.me.entity.User;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */
public interface UserDao {
    User findById(Long id);

    void find();
}
