package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.HotelMapper;
import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    HotelMapper mapper;

    @Override
    public List<Hotel> findAllHotel() {
        List<Hotel> hotel = mapper.findAllHotel();
        return hotel;
    }
}
