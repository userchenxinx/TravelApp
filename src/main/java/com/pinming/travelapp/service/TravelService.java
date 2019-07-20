package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Travel;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 08:42
 **/
public interface TravelService {

    /**
     * 通过id查询travel
     * @param id
     */
    public Travel selectTravelById(int id);

    /**
     * 同过分页查询所有travel
     * @return travel
     */
    public List<Travel> selectAllTravel();
    public List<Travel> selectAllTravel(int page, int pageSize);
}
