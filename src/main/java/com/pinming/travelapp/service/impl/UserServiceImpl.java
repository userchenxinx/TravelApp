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
    public boolean LoginUser(String username , String password) {
        int count = userDao.LoginUser(username , password);
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

    @Override
    public boolean checkUserTel(String tel) {
       int count = userDao.checkUserTel(tel);
       return  count >0?true :false;
    }

    @Override
    public void updateUserValidateCodeByPhone(User user) {
        userDao.updateCodeByphone(user);
    }

    @Override
    public boolean validateByTelCode(User user) {
        int count = userDao.validateTelCode(user);
        return  count > 0 ? true:false;
    }

    @Override
    public boolean addUserValidateCodeByPhone(User user) {
        int count = userDao.insert(user);
        return  count > 0 ? true:false;
    }

    @Override
    public void updateUserPassword(User user) {
        userDao.updatePassword(user);


    }
}
