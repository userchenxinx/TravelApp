package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Trip;
import com.pinming.travelapp.service.TripService;
import com.pinming.travelapp.util.JsonBean;
import com.pinming.travelapp.util.VPageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jie
 * @create: 2019-07-19 19:41
 **/
@RestController
@RequestMapping("/trip")
@CrossOrigin  //跨域注解
@Api(value = "展示出行信息",tags ="出行信息")
public class TripController {

    @Autowired
    TripService tripService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation("该方法是通过分页获取所有出行信息的方法")
    public JsonBean listAll(int page, Integer type, String info){

        VPageInfo<Trip> pageInfo = tripService.findByPage(page, type, info);

        return new JsonBean(1,pageInfo);
    }
}
