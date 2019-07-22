package com.pinming.travelapp.controller;

import com.pinming.travelapp.model.R;
import com.pinming.travelapp.service.OrderdetaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@Api(value = "订单操作",tags ="订单操作")
public class OrderdetaController {
    @Autowired
    private OrderdetaService orderdetaService;
    // 订单详情
    @ApiOperation(value = "订单详情",notes = "订单详情")
    @ResponseBody
    @GetMapping("/ord/orderdeta.do")
    public R findAllOrd(){
        return orderdetaService.findAllOrd();
    }
}
