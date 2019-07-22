package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Like;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-20 17:59
 **/
public interface LikeService {

   public List<Like> findByTidAndUid(Integer tid, Integer uid);

   public void deleteById(Integer id);

   public void saveAndFlush(Like like1);
}
