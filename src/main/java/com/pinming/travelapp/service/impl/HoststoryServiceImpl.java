package com.pinming.travelapp.service.impl;

import com.github.pagehelper.PageHelper;
import com.pinming.travelapp.mapper.HoststoryMapper;
import com.pinming.travelapp.pojo.Hoststory;
import com.pinming.travelapp.service.HoststoryService;
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
    public List<Hoststory> selectAllHoststory() {
        return hoststoryMapper.selectAll();
    }

    @Override
    public List<Hoststory> selectAllHoststory(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Hoststory> list = hoststoryMapper.selectAll();
        return list;
    }

    /**
     * 通过id查询指定的信息
     * @param id
     * @return
     */
    @Override
    public Hoststory finHoststoryById(int id) {
        return hoststoryMapper.selectById(id);
    }
}
