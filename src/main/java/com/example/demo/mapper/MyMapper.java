package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yjl
 * @Description
 * @create 2021-10-13
 * @Version 1.0.0
 */
public interface MyMapper extends JpaRepository<User,Integer> {

}
