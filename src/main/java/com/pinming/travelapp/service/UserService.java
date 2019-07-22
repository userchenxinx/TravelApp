package com.pinming.travelapp.service;


import com.pinming.travelapp.pojo.User;

public interface UserService {

      boolean LoginUser(String username,String password);

      boolean checkUserName(String username);

      int registerUser(User user);

      boolean checkUserTel(String tel);

      void updateUserValidateCodeByPhone(User user);

      boolean validateByTelCode(User user);


      boolean addUserValidateCodeByPhone(User user);

      void updateUserPassword(User user);
}
