package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Hoststory;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-20 09:58
 **/
public interface HoststoryService {

    /**
     * 通过分页查询展示房东故事信息
     * @return
     */
    public List<Hoststory> selectAllHoststory();
    public List<Hoststory> selectAllHoststory(int page, int pageSize);

    /**
     * 通过id查询指定信息
     * @param id
     * @return
     */
    public Hoststory finHoststoryById(int id);
}
