package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.pojo.HotelDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HotelMapper {

    @Select("select * from t_hoteltype_z")
    List<Hotel> findAllHotel();



    List<HotelDetail> findHotel(HotelDetail hotelDetail);

    HotelDetail findDetailMessage(int id);
}
