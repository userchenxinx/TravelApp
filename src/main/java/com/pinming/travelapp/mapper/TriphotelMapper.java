package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Triphotel;

public interface TriphotelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Triphotel record);

    int insertSelective(Triphotel record);

    Triphotel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Triphotel record);

    int updateByPrimaryKeyWithBLOBs(Triphotel record);

    int updateByPrimaryKey(Triphotel record);
}