package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.CollectMapper;
import com.pinming.travelapp.pojo.Collect;
import com.pinming.travelapp.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-22 20:49
 **/
@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;
    @Override
    public List<Collect> findByTidAndUid(Integer tid, Integer uid) {
        List<Collect> list = collectMapper.findByTidAndUid(tid,uid);
        return list;
    }

    @Override
    public void deleteById(Integer id) {
        collectMapper.deleteById(id);
    }

    @Override
    public void saveAndFlush(Collect collect1) {
        collectMapper.saveAndFlush(collect1);
    }
}
