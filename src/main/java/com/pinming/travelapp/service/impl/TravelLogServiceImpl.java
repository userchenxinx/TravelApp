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
}
