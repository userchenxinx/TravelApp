package com.pinming.travelapp.mapper;


import com.pinming.travelapp.pojo.Bcollect;

public interface BcollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bcollect record);

    int insertSelective(Bcollect record);

    Bcollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bcollect record);

    int updateByPrimaryKey(Bcollect record);
}