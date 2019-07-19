package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.TravelLog;
import com.pinming.travelapp.service.TravelLogService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-18 22:18
 **/
@RestController
public class TravelLogController {

    @Autowired
    private TravelLogService travelLogService;

    @RequestMapping("/list.do")
    @ApiOperation("该方法是获取所有旅行故事信息的方法")
    public JsonBean findAll(){
        List<TravelLog> list = travelLogService.findAll();

        return new  JsonBean(1,list);
    }
}
