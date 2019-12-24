package com.example.dyb.register.service;

import com.example.dyb.register.entity.User;

import java.util.List;

public interface UserService {
    List<User> findUser();

    void deleteUser(User user);

    void addUser(User user);
}
