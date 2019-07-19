package com.pinming.travelapp.mapper;


import com.pinming.travelapp.pojo.Takeadds;

public interface TakeaddsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Takeadds record);

    int insertSelective(Takeadds record);

    Takeadds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Takeadds record);

    int updateByPrimaryKey(Takeadds record);
}