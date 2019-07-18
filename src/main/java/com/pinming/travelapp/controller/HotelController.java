package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.service.HotelService;
import com.pinming.travelapp.util.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@Api(value = "酒店信息",tags = "信息")
public class HotelController {

    @Autowired
    HotelService hotelService;

    //展示所有类型的酒店，如民宿，酒店，美食等
    @GetMapping("/findHotel.do")
    @ResponseBody
    public JsonBean findAllHotel(){
        List<Hotel> hotel = hotelService.findAllHotel();
        System.out.println(hotel + "%%%%%%%%%%%");
        return new JsonBean(1,hotel);
    }

    //展示酒店信息  模糊查询
    @PostMapping("findHotel.do")
    public String findHotel(String address,String hotelname){
        hotelService.findHotel(address,hotelname);
        return "";
    }

}


