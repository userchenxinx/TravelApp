package com.pinming.travelapp.service.impl;

import com.github.pagehelper.PageHelper;
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


    /**
     * 查询所有的信息
     * @return
     */
    @Override
    public List<Trip> selectTripAll() {

        return tripMapper.selectAll();
    }

    /**
     * 通过分页展示所有信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Trip> selectTripAll(int page, int pageSize) {

        PageHelper.startPage(page, pageSize);
        List<Trip> list = tripMapper.selectAll();
        return list;
    }
}
