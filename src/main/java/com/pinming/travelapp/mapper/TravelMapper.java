package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Travel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TravelMapper {

    /**
     * 通过id查询travel
     * @param id
     */
    public Travel selectById(int id);

    /**
     * 查询所有travel
     * @return  travel
     */
    public List<Travel> selectAll();
}