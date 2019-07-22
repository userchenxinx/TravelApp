package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Trip;
import com.pinming.travelapp.util.VPageInfo;

/**
 * @author: jie
 * @create: 2019-07-19 19:38
 **/
public interface TripService {

    /**
     * 查询所有的trip信息
     * @return list
     */
    public VPageInfo<Trip> findByPage(int page);
    public VPageInfo<Trip> findByPage(int page, Integer type,  String info);
}
