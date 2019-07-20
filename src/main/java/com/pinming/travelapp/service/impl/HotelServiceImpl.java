package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.HotelMapper;
import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.pojo.HotelDetail;
import com.pinming.travelapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    HotelMapper mapper;

    @Override
    public List<Hotel> findAllHotel() {
        List<Hotel> hotel = mapper.findAllHotel();
        return hotel;
    }

    @Override
    public List<HotelDetail> findHotel(HotelDetail hotelDetail) {


        List<HotelDetail> hotel = mapper.findHotel(hotelDetail);
        return hotel;
    }
}
