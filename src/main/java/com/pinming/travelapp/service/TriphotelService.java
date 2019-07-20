package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Triphotel;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 20:10
 **/
public interface TriphotelService {

    /**
     * 分页展示所有出行专题下的酒店
     * @return map
     */
    public List<Triphotel> selectAllTriphotel();
    public List<Triphotel> selectAllTriphotel(int page, int pageSize);

    /**
     * 通过id查询指定的酒店信息
     * @param id
     * @return Triphotel id
     */
    public Triphotel findTriphotelById(int id);

    /**
     * 通过city升序查询酒店信息
     * @param city
     * @return Triphotel
     */
    public List<Triphotel> selectTriphotelByCity(String city);

    /**
     * 通过city降序查询酒店信息
     * @param city
     * @return Triphotel
     */
    public List<Triphotel> selectTriphotelByCityDesc(String city);
}
