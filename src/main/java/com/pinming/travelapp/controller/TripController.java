package com.pinming.travelapp.controller;

import com.github.pagehelper.PageInfo;
import com.pinming.travelapp.pojo.Trip;
import com.pinming.travelapp.service.TripService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 19:41
 **/
@RestController
@RequestMapping("/trip")
@CrossOrigin  //跨域注解
public class TripController {

    @Autowired
    TripService tripService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过分页获取所有出行信息的方法")
    public JsonBean listAll(Model model, @RequestParam(name = "page",required = false,defaultValue = "1") int page, @RequestParam(name = "pageSize",required = false,defaultValue = "3") int pageSize){

        List<Trip> list = tripService.selectTripAll(page, pageSize);
        PageInfo<Trip> pageInfo = new PageInfo<>(list);

        //System.out.println(list);
        model.addAttribute("pageInfo",pageInfo);

        return new JsonBean(1,list);
    }
}
