package com.demo.me.web;

import com.demo.me.common.Result;
import com.demo.me.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    @ResponseBody
    @RequestMapping(value = "/getRolesByUserId", method = RequestMethod.GET)
    public Result getRolesByUserId(@RequestParam Long id) {
        return new Result(200, "ok", roleService.findRolesByUserId(id));
    }


}
