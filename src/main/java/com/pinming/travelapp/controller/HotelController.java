package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Hotel;
import com.pinming.travelapp.pojo.HotelDetail;
import com.pinming.travelapp.service.HotelService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "房源推荐",tags = "酒店")
//@Api(value = "酒店信息",tags = "信息")
public class HotelController {

    @Autowired
    HotelService hotelService;

    //展示所有类型的酒店，如民宿，酒店，美食等
    @ApiOperation(value = "展示首页，房源， 酒店，等",notes = "展示，不需要传参数")
    @GetMapping(value = "hotel/findHotel.do")
    @ResponseBody
    public JsonBean findAllHotel(Model model){
        List<Hotel> hotel = hotelService.findAllHotel();
        model.addAttribute("hotel",hotel);
        System.out.println(hotel + "%%%%%%%%%%%");
        System.out.println(hotel);
        return new JsonBean(1,hotel);
    }

    //展示酒店信息  模糊查询
    @ApiOperation(value = "点击酒店，进行搜索，展示出来信息",notes = "可以传参数，或者不传，  先不传")
    @GetMapping(value = "hotel/findHotelAll.do")
    @ResponseBody
    public JsonBean findHotel(HotelDetail hotelDetail,Model model){
        List<HotelDetail> hotel = hotelService.findHotel(hotelDetail);
        model.addAttribute("hotel",hotel);
        System.out.println(hotel+"##############132412");
        return new JsonBean(1,hotel);
    }


    //展示酒店具体详情
    @ApiOperation(value = "具体酒店信息",tags = "传入一个酒店id，去展示详情")
    @GetMapping(value = "hotel/findDetailMessage.do")
    @ResponseBody
    public JsonBean findDetailMessage(int id,Model model){
        HotelDetail detailMessage = hotelService.findDetailMessage(id);
        System.out.println(detailMessage.getAddress());
        System.out.println(detailMessage.getHotelDetailD().getHoteldetail());
        model.addAttribute("detailMessage",detailMessage);
        return new JsonBean(1,detailMessage);
    }

}


