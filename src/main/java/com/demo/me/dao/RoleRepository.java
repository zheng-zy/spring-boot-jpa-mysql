package com.demo.me.dao;

import com.demo.me.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/14.
 */
public interface RoleRepository extends JpaRepository<Role, Integer>, JpaSpecificationExecutor<Role> {
}
