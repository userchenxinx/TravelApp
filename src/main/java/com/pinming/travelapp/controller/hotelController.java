package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.service.HotelService;
import com.pinming.travelapp.util.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class hotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/findHotel.do")
    @ResponseBody
    public JsonBean findAllHotel(){
        List<Hotel> hotel = hotelService.findAllHotel();
        System.out.println(hotel + "%%%%%%%%%%%");
        return new JsonBean(1,hotel);
    }

}
