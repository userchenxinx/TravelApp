package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Travel;
import com.pinming.travelapp.util.VPageInfo;

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
    public VPageInfo<Travel> findByPage(int page);
    public VPageInfo<Travel> findByPage(int page,Integer type, String info);


    /**
     * 通过id查询likes
     * @param id
     */
    public Travel findTravelById(int id);
}
