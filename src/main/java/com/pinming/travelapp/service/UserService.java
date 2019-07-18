package com.pinming.travelapp.service;


import com.pinming.travelapp.pojo.User;

public interface UserService {

      boolean LoginUser(User user);

      boolean checkUserName(String username);

      int registerUser(User user);
}
