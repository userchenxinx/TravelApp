package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.CommentMapper;
import com.pinming.travelapp.pojo.Comment;
import com.pinming.travelapp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-20 15:31
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;


    /**
     * 查询所有数据的实现方法
     * @return map
     */
    @Override
    public List<Comment> selectAllComment() {
        return commentMapper.selectAll();
    }
}
