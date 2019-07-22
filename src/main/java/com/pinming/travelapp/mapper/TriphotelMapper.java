package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Triphotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TriphotelMapper {

    /**
     * 展示所有出行专题下的酒店
     * @return map
     */
    public List<Triphotel> findByIndexAndSize(@Param("index") int index, @Param("size") int size, @Param("type") Integer type, @Param("info") String info);
    public int count(@Param("type") Integer type, @Param("info") String info);

    /**
     * 通过id查询指定的酒店
     * @param id
     * @return triphotel id
     */
    public Triphotel findById(int id);

    /**
     * 通过city升序查询酒店
     * @param city
     * @return Triphotel
     */
    public List<Triphotel> selectByCity(String city);

    /**
     * 通过city降序查询酒店
     * @param city
     * @return
     */
    public List<Triphotel> selectByCityDesc(String city);

}