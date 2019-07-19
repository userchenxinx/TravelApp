package com.pinming.travelapp.mapper;


import com.pinming.travelapp.pojo.Setport;

public interface SetportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Setport record);

    int insertSelective(Setport record);

    Setport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Setport record);

    int updateByPrimaryKey(Setport record);
}