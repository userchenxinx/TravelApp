package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Travel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    public List<Travel> findByIndexAndSize(@Param("index") int index, @Param("size") int size, @Param("type") Integer type, @Param("info") String info);
    public int count(@Param("type") Integer type, @Param("info") String info);


    /**
     * 通过id查询likes
     * @param id
     */
    public Travel findById(int id);
}