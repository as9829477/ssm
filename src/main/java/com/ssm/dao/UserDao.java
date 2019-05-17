package com.ssm.dao;

import com.ssm.beans.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    List<User> getUserList();
}
