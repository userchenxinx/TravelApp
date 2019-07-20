package com.pinming.travelapp.controller;

import com.github.pagehelper.PageInfo;
import com.pinming.travelapp.pojo.Triphotel;
import com.pinming.travelapp.service.TriphotelService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 20:14
 **/
@RestController
@RequestMapping("/triphotel")
@CrossOrigin //跨域注解
public class TriphotelController {

    @Autowired
    TriphotelService triphotelService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过分页获取所有出行专题下的旅馆信息的方法")
    public JsonBean listAll(Model model, @RequestParam(name = "page",required = false,defaultValue = "1") int page, @RequestParam(name = "pageSize",required = false,defaultValue = "3") int pageSize){

        List<Triphotel> list = triphotelService.selectAllTriphotel(page, pageSize);
        PageInfo<Triphotel> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo",pageInfo);

        return new JsonBean(1,list);

    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过id获取出行专题下的旅馆信息的方法")
    public JsonBean findById(int id, Model model){

        Triphotel triphotel = triphotelService.findTriphotelById(id);
        model.addAttribute("triphotel", triphotel);

        return new JsonBean(1, triphotel);
    }

    @RequestMapping(value = "/asc.do", method = RequestMethod.POST)
    @ApiOperation("该方法是通过city升序获取出行专题下的旅馆信息的方法")
    public JsonBean findByCity(String city, Model model){

        List<Triphotel> ascList = triphotelService.selectTriphotelByCity(city);
        model.addAttribute("ascList", ascList);

        return new JsonBean(1, ascList);
    }

    @RequestMapping(value = "/desc.do", method = RequestMethod.POST)
    @ApiOperation("该方法是通过city升序获取出行专题下的旅馆信息的方法")
    public JsonBean findByCitydesc(String city, Model model){

        List<Triphotel> descList = triphotelService.selectTriphotelByCityDesc(city);
        model.addAttribute("descList", descList);

        return new JsonBean(1, descList);
    }

}
