package com.example.dyb.register.controller;

import com.example.dyb.register.entity.User;
import com.example.dyb.register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/findUsers")
    public List<User> findUser(){
        return userService.findUser();
    }

    @RequestMapping("/deleteUserById/{id}")
    public String deleteUser(User user){
        userService.deleteUser(user);
        return "index";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        user.setPassword("123456");
        user.setSalt("123456");
        userService.addUser(user);
        return "index";
    }
}
