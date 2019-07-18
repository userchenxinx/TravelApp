package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Hoststory;

public interface HoststoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hoststory record);

    int insertSelective(Hoststory record);

    Hoststory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hoststory record);

    int updateByPrimaryKeyWithBLOBs(Hoststory record);

    int updateByPrimaryKey(Hoststory record);
}