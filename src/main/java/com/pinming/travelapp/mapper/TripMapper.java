package com.pinming.travelapp.mapper;

import com.pinming.travelapp.pojo.Trip;

import java.util.List;

public interface TripMapper {

    public List<Trip> selectAll();
}