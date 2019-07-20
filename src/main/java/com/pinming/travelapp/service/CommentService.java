package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Comment;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-20 15:29
 **/
public interface CommentService {

    /**
     * 查询所有数据
     * @return map
     */
    public List<Comment> selectAllComment();
}
