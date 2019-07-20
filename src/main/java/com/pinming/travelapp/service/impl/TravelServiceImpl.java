package com.pinming.travelapp.service.impl;

import com.github.pagehelper.PageHelper;
import com.pinming.travelapp.mapper.TravelMapper;
import com.pinming.travelapp.pojo.Travel;
import com.pinming.travelapp.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 08:43
 **/
@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    TravelMapper travelMapper;

    /**
     * 通过id查询指定的travel
     * @param id
     */
    @Override
    public Travel selectTravelById(int id) {
        return travelMapper.selectById(id);
    }

    /**
     * 查询所有的travel的实现方法
     * @return
     */
    @Override
    public List<Travel> selectAllTravel() {
        return travelMapper.selectAll();
    }

    /**
     * 通过分页展示所有信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Travel> selectAllTravel(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Travel> list = travelMapper.selectAll();

        return list;
    }
}
