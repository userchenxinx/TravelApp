package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Orderdeta;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderdetaMapper {
    // 展示订单
    List<Orderdeta> findAllOrd();
}