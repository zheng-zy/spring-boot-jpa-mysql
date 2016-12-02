package com.demo.me.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
 * Created by zhengzy on 2016/11/8.
 */
@Entity
@Table(name = "tbl_users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -5451740152235826540L;
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Column(length = 20)
    private String firstName;
    @NotNull
    @Column(length = 20)
    private String lastName;
    @NotNull
    @Column
    private Date updateTime;


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
