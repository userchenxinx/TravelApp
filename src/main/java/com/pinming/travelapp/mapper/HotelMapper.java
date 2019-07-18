package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HotelMapper {

    @Select("select * from t_hoteltype_z")
    List<Hotel> findAllHotel();
}
