package com.wst.controller;


import com.wst.service.IUserService;
import com.wst.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wst
 * @since 2021-08-05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService = new UserServiceImpl();

    @GetMapping("/{id}")
    public Object queryUserById(@PathVariable("id") Long id){

        return userService.getById(id);
    }
    @GetMapping("/count")
    public Object queryUser(){
        return userService.count();
    }


}
