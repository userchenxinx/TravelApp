package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.TravelMapper;
import com.pinming.travelapp.pojo.Travel;
import com.pinming.travelapp.service.TravelService;
import com.pinming.travelapp.util.VPageInfo;
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
    public VPageInfo<Travel> findByPage(int page) {
        return null;
    }

    @Override
    public VPageInfo<Travel> findByPage(int page, Integer type, String info) {
        // TODO Auto-generated method stub
        VPageInfo<Travel> pageInfo = new VPageInfo<Travel>();
        pageInfo.setCurrentPage(page);

        // 设置总页数
        int count = travelMapper.count(type, info);
        int size = pageInfo.getPageSize();
        int totalPage = 0;
        if(count % size == 0 ){
            totalPage = count / size;
        }else{
            totalPage = count / size + 1;
        }
        pageInfo.setTotalPage(totalPage);

        // 设置当前页查询到的数据
        int index = (page - 1) * pageInfo.getPageSize();
        List<Travel> clist = travelMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type, info);
        pageInfo.setInfos(clist);


        return pageInfo;
    }


    /**
     * 通过id查询指定的likes
     * @param id
     */
    @Override
    public Travel findTravelById(int id) {
        return travelMapper.findById(id);
    }
}
