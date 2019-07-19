package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Trip;
import com.pinming.travelapp.service.TripService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 19:41
 **/
@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    TripService tripService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation("该方法是获取所有出行信息的方法")
    public JsonBean listAll(Model model){

        List<Trip> list = tripService.selectTripAll();
        System.out.println(list);
        model.addAttribute("list",list);

        return new JsonBean(1,list);
    }
}
