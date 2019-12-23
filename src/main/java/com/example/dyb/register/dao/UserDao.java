package com.example.dyb.register.dao;


import com.example.dyb.register.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("SELECT * FROM SYS_USERS")
    List<User> findUser();
}
