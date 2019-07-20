package com.pinming.travelapp.service;

import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.pojo.HotelDetail;

import java.util.List;

public interface HotelService {
    List<Hotel> findAllHotel();

    List<HotelDetail> findHotel(HotelDetail hotelDetail);

    //查询详情酒店
    HotelDetail findDetailMessage(int id);
}
