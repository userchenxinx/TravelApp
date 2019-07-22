package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Hoststory;
import com.pinming.travelapp.util.VPageInfo;

/**
 * @author: jie
 * @create: 2019-07-20 09:58
 **/
public interface HoststoryService {

    /**
     * 通过分页查询展示房东故事信息
     * @return
     */
    public VPageInfo<Hoststory> findByPage(int page);

    public VPageInfo<Hoststory> findByPage(int page, Integer type, String info);

    /**
     * 通过id查询指定信息
     * @param id
     * @return
     */
    public Hoststory findHoststoryById(int id);

    /**
     * 通过id查询指定likes信息
     * @param id
     * @return
     */
    public Hoststory findLikesById(int id);
}
