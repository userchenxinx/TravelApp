package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Hoststory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HoststoryMapper {

    /**
     * 查询所有的房东故事信息
     * @return map
     */
    public List<Hoststory> findByIndexAndSize(@Param("index") int index, @Param("size") int size, @Param("type") Integer type, @Param("info") String info);
    public int count(@Param("type") Integer type, @Param("info") String info);

    /**
     * 通过id查询指定的信息
     * @param id
     * @return Hoststory
     */
    public Hoststory selectById(int id);

    /**
     * 通过id查询指定likes的信息
     * @param id
     * @return Hoststory
     */
    public Hoststory findById(int id);
}