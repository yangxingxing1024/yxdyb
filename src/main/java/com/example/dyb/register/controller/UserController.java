package com.example.dyb.register.controller;

import com.example.dyb.register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }

}
