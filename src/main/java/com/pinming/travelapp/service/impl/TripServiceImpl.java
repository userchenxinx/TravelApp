package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.TripMapper;
import com.pinming.travelapp.pojo.Trip;
import com.pinming.travelapp.service.TripService;
import com.pinming.travelapp.util.VPageInfo;
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
     * 分页查询所有的信息
     * @return
     */
    @Override
    public VPageInfo<Trip> findByPage(int page) {

        return null;
    }

    /**
     * 通过分页展示所有信息
     * @param page
     * @param type
     * @param info
     * @return
     */
    @Override
    public VPageInfo<Trip> findByPage(int page, Integer type, String info) {
        VPageInfo<Trip> pageInfo = new VPageInfo<>();
        pageInfo.setCurrentPage(page);
        //设置总页数
        int count = tripMapper.count(type, info);
        int size = pageInfo.getPageSize();
        int totalPage = 0;
        if (count % size ==0){
            totalPage = count / size;
        }else {
            totalPage = count /size + 1;
        }
        pageInfo.setTotalPage(totalPage);
        //设置当前查询的数据
        int index = (page - 1) * pageInfo.getPageSize();
        List<Trip> list = tripMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type,info);
        pageInfo.setInfos(list);

        return pageInfo;
    }
}
