package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Like;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-20 18:04
 **/
@Mapper
public interface LikeMapper {

    public List<Like> findByTidAndUid(Integer tid, Integer uid);

    public void deleteById(Integer id);

    public void addLike(Like like1);
}
