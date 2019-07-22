package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.HoststoryMapper;
import com.pinming.travelapp.pojo.Hoststory;
import com.pinming.travelapp.service.HoststoryService;
import com.pinming.travelapp.util.VPageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-20 10:07
 **/
@Service
public class HoststoryServiceImpl implements HoststoryService {

    @Autowired
    HoststoryMapper hoststoryMapper;

    @Override
    public VPageInfo<Hoststory> findByPage(int page) {
        return null;
    }

    @Override
    public VPageInfo<Hoststory> findByPage(int page, Integer type, String info) {
        // TODO Auto-generated method stub
        VPageInfo<Hoststory> pageInfo = new VPageInfo<Hoststory>();
        pageInfo.setCurrentPage(page);

        // 设置总页数
        int count = hoststoryMapper.count(type, info);
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
        List<Hoststory> clist = hoststoryMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type, info);
        pageInfo.setInfos(clist);


        return pageInfo;
    }

    /**
     * 通过id查询指定的信息
     * @param id
     * @return
     */
    @Override
    public Hoststory findHoststoryById(int id) {
        return hoststoryMapper.selectById(id);
    }

    /**
     * 通过id查询指定的信息
     * @param id
     * @return
     */
    @Override
    public Hoststory findLikesById(int id) {
        return hoststoryMapper.findById(id);
    }
}
