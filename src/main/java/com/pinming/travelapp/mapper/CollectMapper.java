package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Collect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-22 20:51
 **/
@Mapper
public interface CollectMapper {

    List<Collect> findByTidAndUid(@Param("tid") Integer tid,@Param("uid") Integer uid);

    void deleteById(Integer id);

    void saveAndFlush(Collect collect1);
}
