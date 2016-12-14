package com.demo.me.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/2.
 */
@Entity
@Table(name = "tbl_roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue
    private Integer id;
    private String roleName;
    private String memo;
    private Long userId;

    public Role(String roleName, String desc, Long userId) {
        this.roleName = roleName;
        this.memo = desc;
        this.userId = userId;
    }

}
