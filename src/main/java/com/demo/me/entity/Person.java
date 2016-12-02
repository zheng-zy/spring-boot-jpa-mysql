package com.demo.me.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/2.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
}
