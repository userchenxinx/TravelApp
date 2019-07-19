package com.pinming.travelapp.service.impl;

import com.github.pagehelper.PageHelper;
import com.pinming.travelapp.mapper.TriphotelMapper;
import com.pinming.travelapp.pojo.Triphotel;
import com.pinming.travelapp.service.TriphotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 20:12
 **/
@Service
public class TriphotelServiceImpl implements TriphotelService {

    @Autowired
    TriphotelMapper triphotelMapper;


    /**
     * 查询所有的酒店信息
     * @return
     */
    @Override
    public List<Triphotel> selectAllTriphotel() {

        return triphotelMapper.selectAll();
    }

    /**
     * 通过分页展示酒店信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Triphotel> selectAllTriphotel(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Triphotel> list = triphotelMapper.selectAll();

        return list;
    }

    /**
     * 通过id查询指定的酒店信息
     * @param id
     * @return
     */
    @Override
    public Triphotel findTriphotelById(int id) {

        return triphotelMapper.findById(id);
    }
}
