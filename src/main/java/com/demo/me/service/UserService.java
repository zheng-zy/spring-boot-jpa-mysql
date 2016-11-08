package com.demo.me.service;

import com.demo.me.dao.UserDao;
import com.demo.me.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 服务层
 * Created by zhengzy on 2016/11/8.
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User findByid(Long id) {
        return userDao.findById(id);
    }

}
