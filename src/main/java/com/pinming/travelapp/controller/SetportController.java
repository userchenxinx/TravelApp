package com.pinming.travelapp.controller;

import com.pinming.travelapp.model.R;
import com.pinming.travelapp.service.SetportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "设置操作",tags ="设置操作")
public class SetportController {
    @Autowired
    private SetportService setportService;

    // 设置
    @ApiOperation(value = "设置",notes = "设置")
    @ResponseBody
    @GetMapping("/set/setport.do")
    public R SelectSet(){
        return setportService.selectSet();
    }

    // 个人资料
    @ApiOperation(value = "个人资料",notes = "个人资料")
    @ResponseBody
    @GetMapping("/set/personage.do")
    public R selectByUname(String username){
        return setportService.selectByUname(username);
    }
}
