package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.CommentMapper;
import com.pinming.travelapp.pojo.Comment;
import com.pinming.travelapp.service.CommentService;
import com.pinming.travelapp.util.VPageInfo;
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
//    @Override
//    public List<Comment> selectAllComment() {
//        return commentMapper.selectAll();
//    }

    @Override
    public VPageInfo<Comment> findByPage(int page) {
        return null;
    }

    @Override
    public VPageInfo<Comment> findByPage(int page, Integer type, String info) {
        // TODO Auto-generated method stub
        VPageInfo<Comment> pageInfo = new VPageInfo<Comment>();
        pageInfo.setCurrentPage(page);

        // 设置总页数
        int count = commentMapper.count(type, info);
        int size = pageInfo.getPageSize();
        int totalPage = 0;
        if(count % size == 0 ){
            totalPage = count / size;
        }else{
            totalPage = count / size + 1;
        }
        pageInfo.setTotalPage(totalPage);

        // 设置当前页查询到的数据
        int index = (page - 1) * pageInfo.getPageSize();
        List<Comment> clist = commentMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type, info);
        pageInfo.setInfos(clist);


        return pageInfo;
    }
}
