package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Hoststory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HoststoryMapper {

    /**
     * 查询所有的房东故事信息
     * @return map
     */
    public List<Hoststory> selectAll();

    /**
     * 通过id查询指定的信息
     * @param id
     * @return Hoststory
     */
    public Hoststory selectById(int id);
}