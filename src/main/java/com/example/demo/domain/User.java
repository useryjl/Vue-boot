package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author yjl
 * @Description
 * @create 2021-10-13
 * @Version 1.0.0
 */
@Entity
@Data
public class User {
    @Id //主键
    private Integer no;
    private String name;
    private String email;
}
