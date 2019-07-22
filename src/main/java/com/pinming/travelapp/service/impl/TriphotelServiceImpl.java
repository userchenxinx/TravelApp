package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.TriphotelMapper;
import com.pinming.travelapp.pojo.Triphotel;
import com.pinming.travelapp.service.TriphotelService;
import com.pinming.travelapp.util.VPageInfo;
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
    public VPageInfo<Triphotel> findByPage(int page) {

        return null;
    }

    /**
     * 通过分页展示酒店信息
     * @param page
     * @param type
     * @return
     */
    @Override
    public VPageInfo<Triphotel> findByPage(int page, Integer type, String info) {
        VPageInfo<Triphotel> pageInfo = new VPageInfo<Triphotel>();
        pageInfo.setCurrentPage(page);
        //设置总页数
        int count = triphotelMapper.count(type, info);
        int size = pageInfo.getPageSize();
        int totalPage = 0;
        if (count % size == 0){
            totalPage = count / size;
        }else {
            totalPage = count / size + 1;
        }
        pageInfo.setTotalPage(totalPage);
        //设置当前查询的数据
        int index = (page -1) * pageInfo.getPageSize();
        List<Triphotel> clist = triphotelMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type, info);
        pageInfo.setInfos(clist);


        return pageInfo;
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

    /**
     * 通过city升序查询旅馆
     * @param city
     * @return
     */
    @Override
    public List<Triphotel> selectTriphotelByCity(String city) {

        return triphotelMapper.selectByCity(city);
    }

    /**
     * 通过city降序查询旅馆
     * @param city
     * @return
     */
    @Override
    public List<Triphotel> selectTriphotelByCityDesc(String city) {
        return triphotelMapper.selectByCityDesc(city);
    }
}
