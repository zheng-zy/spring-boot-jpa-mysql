package com.demo.me.service;

import com.alibaba.fastjson.JSON;
import com.demo.me.dao.UserDao;
import com.demo.me.dao.UserRepository;
import com.demo.me.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.*;

/**
 * 服务层
 * Created by zhengzy on 2016/11/8.
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private UserRepository userRepository;

    public User findByid(Long id) {
        User user = userDao.findById(id);
        System.out.println("JSON.toJSONString(user) = " + JSON.toJSONString(user));
        userDao.find();
        return userRepository.findById(id);
    }

    public Page<User> findAll(Pageable pageable, Map<String, Object> params) {
        return userRepository.findAll((root, cq, cb) -> {
            System.out.println(params);
            List<Predicate> predicates = new ArrayList<>();
            predicates.add(cb.like(root.get("firstName").as(String.class), "%xiao%"));
            predicates.add(cb.equal(root.get("lastName").as(String.class), "xiao2"));
            Date date = new Date();
            Date before;
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, 1);
            date = calendar.getTime();
            calendar.add(Calendar.DATE, -2);
            before = calendar.getTime();
            predicates.add(cb.between(root.get("updateTime").as(Date.class), before, date));
            return cq.where(predicates.toArray(new Predicate[predicates.size()])).getGroupRestriction();
        }, pageable);
    }
}
