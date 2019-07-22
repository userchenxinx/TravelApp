package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Triphotel;
import com.pinming.travelapp.service.TriphotelService;
import com.pinming.travelapp.util.JsonBean;
import com.pinming.travelapp.util.VPageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 20:14
 **/
@RestController
@RequestMapping("/triphotel")
@CrossOrigin //跨域注解
@Api(value = "展示出行旅馆信息",tags ="出行旅馆信息")
public class TriphotelController {

    @Autowired
    TriphotelService triphotelService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过分页获取所有出行专题下的旅馆信息的方法")
    public JsonBean listAll(int page,Integer type, String info){

        VPageInfo<Triphotel> pageInfo = triphotelService.findByPage(page,type,info);

        return new JsonBean(1,pageInfo);

    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过id获取出行专题下的旅馆信息的方法")
    public JsonBean findById(int id, Model model){

        Triphotel triphotel = triphotelService.findTriphotelById(id);
        model.addAttribute("triphotel", triphotel);

        return new JsonBean(1, triphotel);
    }

    @RequestMapping(value = "/asc.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过city升序获取出行专题下的旅馆信息的方法")
    public JsonBean findByCity(String city, Model model){

        List<Triphotel> ascList = triphotelService.selectTriphotelByCity(city);
        model.addAttribute("ascList", ascList);

        return new JsonBean(1, ascList);
    }

    @RequestMapping(value = "/desc.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过city升序获取出行专题下的旅馆信息的方法")
    public JsonBean findByCitydesc(String city, Model model){

        List<Triphotel> descList = triphotelService.selectTriphotelByCityDesc(city);
        model.addAttribute("descList", descList);

        return new JsonBean(1, descList);
    }

}
