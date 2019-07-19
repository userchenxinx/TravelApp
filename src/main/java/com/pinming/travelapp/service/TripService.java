package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Trip;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 19:38
 **/
public interface TripService {

    /**
     * 查询所有的trip信息
     * @return list
     */
    public List<Trip> selectTripAll();
}
