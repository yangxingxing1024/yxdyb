package com.example.dyb.register.service;

import com.example.dyb.register.dao.UserDao;
import com.example.dyb.register.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void deleteUser(User user) {
       userDao.deleteUser(user);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    public List<User> findUser(){
        return userDao.findUser();
    }

}
