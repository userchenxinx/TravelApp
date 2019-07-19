package com.pinming.travelapp.mapper;


import com.pinming.travelapp.model.Person;
import com.pinming.travelapp.pojo.Setport;
;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SetportMapper {
    // 设置
    List<Setport> findSet();
    // 个人资料
    List<Person> findByUname(String username);

}