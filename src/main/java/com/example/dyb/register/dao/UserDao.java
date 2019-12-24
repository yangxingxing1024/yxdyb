package com.example.dyb.register.dao;


import com.example.dyb.register.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("SELECT * FROM SYS_USERS")
    List<User> findUser();
    @Delete("DELETE FROM SYS_USERS WHERE id = #{id}")
    void deleteUser(User user);
    @Insert("insert into SYS_USERS (id,username,password,salt) VALUES(null,#{username},#{password},#{salt})")
    void addUser(User user);
}
