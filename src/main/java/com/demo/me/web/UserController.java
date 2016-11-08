package com.demo.me.web;

import com.demo.me.common.Result;
import com.demo.me.dao.UserDao;
import com.demo.me.entity.User;
import com.demo.me.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 控制器
 * Created by zhengzy on 2016/11/8.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private UserDao userDao;

    @ResponseBody
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    public Result findById(@RequestBody Map<String, String> params) {
        Long id = Long.parseLong(params.getOrDefault("id", "1"));
        User user = userService.findByid(id);
        if (null == user) {
            user = new User("auto", "create");
            userDao.save(user);
        }
        return new Result(200, "ok", user);
    }

    /**
     * 分页排序查询
     * http://127.0.0.1:8888/user/findAll?size=10&page=0&sort=id,desc
     */
    @ResponseBody
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }

}
