package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.pojo.HotelDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface HotelMapper {

    @Select("select * from t_hoteltype_z")
    List<Hotel> findAllHotel();



    List<HotelDetail> findHotel(Map<String, String> map);
}
