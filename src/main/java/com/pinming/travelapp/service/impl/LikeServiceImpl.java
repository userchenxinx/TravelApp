package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.LikeMapper;
import com.pinming.travelapp.pojo.Like;
import com.pinming.travelapp.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-20 18:01
 **/
@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeMapper likeMapper;


    @Override
    public List<Like> findByTidAndUid(Integer tid, Integer uid) {
        List<Like> list = likeMapper.findByTidAndUid(tid,uid);
        return list;
    }

    @Override
    public void deleteById(Integer id) {
        likeMapper.deleteById(id);
    }

    @Override
    public void saveAndFlush(Like like1) {
        likeMapper.addLike(like1);

    }
}
