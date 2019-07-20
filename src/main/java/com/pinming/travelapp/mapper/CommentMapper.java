package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    /**
     * 查询所有的信息
     * @return map
     */
    public List<Comment> selectAll();



}