package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Trip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TripMapper {

    /**
     * 查询所有的trip信息
     * @return
     */
    public List<Trip> selectAll();
}