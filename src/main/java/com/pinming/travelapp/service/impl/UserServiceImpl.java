package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.UserMapper;
import com.pinming.travelapp.pojo.User;
import com.pinming.travelapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
   private UserMapper userDao;

    @Override
    public boolean LoginUser(User user) {
        int count = userDao.LoginUser(user);
        return count > 0 ? true :false;
    }

    @Override
    public boolean checkUserName(String username) {
        int count = userDao.checkUserName(username);
        return count >0? true : false;
    }

    @Override
    public int registerUser(User user) {
        return userDao.insertSelective(user);
    }
}
