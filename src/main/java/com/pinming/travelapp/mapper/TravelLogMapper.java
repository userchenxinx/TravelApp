package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.TravelLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-18 22:15
 **/
@Mapper
public interface TravelLogMapper {

    public List<TravelLog> findAll();

   public TravelLog findById(Integer id);

    TravelLog findByIdForUpdate(Integer tid);

    void saveAndFlush(Integer id);

    void delAndFlush(Integer id);
}
