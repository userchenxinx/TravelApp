package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Collect;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-22 20:47
 **/
public interface CollectService {

     List<Collect> findByTidAndUid(Integer tid, Integer uid);

    void deleteById(Integer id);

    void saveAndFlush(Collect collect1);
}
