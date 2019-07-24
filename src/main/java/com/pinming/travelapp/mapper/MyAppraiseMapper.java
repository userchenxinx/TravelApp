package com.pinming.travelapp.mapper;


import com.pinming.travelapp.pojo.MyAppraise;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MyAppraiseMapper {
    // 展示我的评价
    List<MyAppraise> findAllAppr();
    // 添加订单
    void addAppr(MyAppraise myAppraise);
    // 通过订单号撰写评价
    MyAppraise findByOrd(int ordernum);

    void updateAppr(MyAppraise myAppraise);

}
