package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //
    int LoginUser(String username,String password);

    int checkUserTel(String tel);

    int checkUserName(String username);

    int  validateTelCode(User user);


    void updateCodeByphone(User user);

    void updatePassword(User user);
}