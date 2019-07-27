package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.TravelLog;
import com.pinming.travelapp.service.TravelLogService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-18 22:18
 **/
@RestController
@RequestMapping("/travelLog")
@Api(value = "该类主要负责旅行故事相关",tags ="该类主要负责旅行故事相关")
//解决跨域
@CrossOrigin
public class TravelLogController {

    @Autowired
    private TravelLogService travelLogService;

    @GetMapping("/list.do")
    @ApiOperation("该方法是获取所有旅行故事信息的方法")
    public JsonBean findAll(){
        List<TravelLog> list = travelLogService.findAll();
        return new  JsonBean(1,list);
    }

    @GetMapping("/findById.do")
    @ApiOperation("该方法展示具体的某个地方的详细旅行故事信息")
    public JsonBean findById(Integer id){
        TravelLog travelLog = travelLogService.findById(id);
        return new JsonBean(1,travelLog);
    }
}
