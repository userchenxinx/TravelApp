package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.TripMapper;
import com.pinming.travelapp.pojo.Trip;
import com.pinming.travelapp.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 19:40
 **/
@Service
public class TripServiceImpl implements TripService {

    @Autowired
    TripMapper tripMapper;


    @Override
    public List<Trip> selectTripAll() {

        return tripMapper.selectAll();
    }
}
