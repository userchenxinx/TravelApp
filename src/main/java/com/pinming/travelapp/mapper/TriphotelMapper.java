package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Triphotel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TriphotelMapper {

    /**
     * 展示所有出行专题下的酒店
     * @return map
     */
    public List<Triphotel> selectAll();

    /**
     * 通过id查询指定的酒店
     * @param id
     * @return triphotel id
     */
    public Triphotel findById(int id);

}