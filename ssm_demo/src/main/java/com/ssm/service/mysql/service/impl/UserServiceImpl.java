package com.ssm.service.mysql.service.impl;

import com.ssm.beans.User;
import com.ssm.dao.UserDao;
import com.ssm.service.mysql.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
