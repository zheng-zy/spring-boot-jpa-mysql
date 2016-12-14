package com.demo.me.dao;

import com.demo.me.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * 数据访问层
 * Created by zhengzy on 2016/11/8.
 */
@Transactional
public interface UserRepository extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findById(Long id);
}
