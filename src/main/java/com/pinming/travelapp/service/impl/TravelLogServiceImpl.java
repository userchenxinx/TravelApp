package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.TravelLogMapper;
import com.pinming.travelapp.pojo.TravelLog;
import com.pinming.travelapp.service.TravelLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-18 22:33
 **/
 @Service
 public class TravelLogServiceImpl implements TravelLogService {

    @Autowired
    private TravelLogMapper travelLogMapper;
    @Override
    public List<TravelLog> findAll() {
        List<TravelLog> list = travelLogMapper.findAll();
        return list;
    }

    @Override
    public TravelLog findById(Integer id) {
        TravelLog travelLog = travelLogMapper.findById(id);
        return travelLog;
    }

    @Override
    public TravelLog findByIdForUpdate(Integer tid) {
        TravelLog travelLog = travelLogMapper.findByIdForUpdate(tid);
        return travelLog;
    }

    @Override
    public void saveAndFlush(Integer id) {
        travelLogMapper.saveAndFlush(id);
    }

    @Override
    public void delAndFlush(Integer id) {
        travelLogMapper.delAndFlush(id);
    }

    @Override
    public void addAndFlush(Integer id) {
        travelLogMapper.addAndFlush(id);
    }

    @Override
    public void reduceAndFlush(Integer id) {
        travelLogMapper.reduceAndFlush(id);
    }
}
