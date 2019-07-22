package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.TravelLog;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-18 22:32
 **/
public interface TravelLogService {

    public List<TravelLog> findAll();

    public TravelLog findById(Integer id);

    public TravelLog findByIdForUpdate(Integer tid);

    void saveAndFlush(Integer id);

    void delAndFlush(Integer id);

    void addAndFlush(Integer id);

    void reduceAndFlush(Integer id);
}
