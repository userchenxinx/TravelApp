package com.pinming.travelapp.controller;

import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.MyAppraise;
import com.pinming.travelapp.service.AppraiseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@Api(value = "评价操作",tags ="评价操作")
public class AppraiseController {
    @Autowired
    private AppraiseService appraiseService;

    // 我的评价
    @ApiOperation(value = "展示我的评价",notes = "展示我的评价")
    @ResponseBody
    @GetMapping("/appr/myapprshow.do")
    public R findAllMyAppr(){
        return appraiseService.findMyAppr();
    }
    // 评价
    @ApiOperation(value = "评价",notes = "评价")
    @ResponseBody
    @GetMapping("/appr/addapprshow.do")
    public R addAprr(MyAppraise myAppraise){
        return appraiseService.addAppr(myAppraise);
    }
}
