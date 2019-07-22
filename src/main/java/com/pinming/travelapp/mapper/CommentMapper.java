package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

    /**
     * 查询所有的信息
     * @return map
     */
    //public List<Comment> selectAll();

    public List<Comment> findByIndexAndSize(@Param("index") int index, @Param("size") int size, @Param("type") Integer type, @Param("info") String info);
    public int count(@Param("type") Integer type, @Param("info") String info);


}