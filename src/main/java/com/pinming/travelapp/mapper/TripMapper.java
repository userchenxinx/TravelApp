package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Trip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TripMapper {

    /**
     * 查询所有的trip信息
     * @return
     */
    public List<Trip> findByIndexAndSize(@Param("index") int index, @Param("size") int size, @Param("type") Integer type, @Param("info") String info);
    public int count(@Param("type") Integer type, @Param("info") String info);
}