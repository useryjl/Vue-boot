package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-10-13
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/user/api")
public class Controller {
    @Autowired
    MyMapper myMapper;

    //查询
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List userfind(){
        List<User> all = myMapper.findAll();
        System.out.println(all);
        return all;
    }

    //删除
    @RequestMapping(value = "/delete",method = RequestMethod.GET )
    public String userdelete(@RequestParam Integer id){
        myMapper.deleteById(id);
        System.out.println("delete success");
        return "success";
    }

    //新增
    @RequestMapping(value = "/insert",method = RequestMethod.GET )
    public User userinsert(@RequestParam("no") Integer no,@RequestParam("name") String name,@RequestParam("email") String email){
        System.out.println("no:  "+no+"name:  "+name+"email:  "+email);
        System.out.println("进入insert方法");
        User user=new User();
        user.setNo(no);
        user.setName(name);
        user.setEmail(email);
        User user1 = myMapper.save(user);
        System.out.println("===新增成功==="+user1);
        return user1;
    }

    //更新 使用saveAndFlush方法
    @RequestMapping(value = "/update",method = RequestMethod.GET )
    public User userupdate(@RequestParam("no") Integer no,@RequestParam("name") String name,@RequestParam("email") String email){
        User user=new User();
        user.setNo(no);
        user.setName(name);
        user.setEmail(email);
        myMapper.saveAndFlush(user);
        System.out.println(user);
        System.out.println("update success");
        return user;
    }
}
