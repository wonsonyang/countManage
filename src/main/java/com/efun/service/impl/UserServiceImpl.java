package com.efun.service.impl;

import com.efun.dao.UserDao;
import com.efun.pojo.User;
import com.efun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public Integer save(User entity) {

        return userDao.save(entity);
    }
}
