package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Hoststory;
import com.pinming.travelapp.service.HoststoryService;
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

/**
 * @author: jie
 * @create: 2019-07-20 10:17
 **/
@RestController
@RequestMapping("/hoststory")
@CrossOrigin //跨域注解
@Api(value = "展示房东故事信息", tags ="房东故事")
public class HoststoryController {

    @Autowired
    HoststoryService hoststoryService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有hoststory信息的方法")
    public JsonBean findByPage(int page, Integer type, String info){
        VPageInfo<Hoststory> pageInfo = hoststoryService.findByPage(page, type, info);

        return new JsonBean(1, pageInfo);

    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过id获取指定hoststory信息的方法")
    public JsonBean selectById(int id, Model model){
        Hoststory hoststory = hoststoryService.findHoststoryById(id);
        model.addAttribute("hoststory",hoststory);

        return new JsonBean(1,hoststory);
    }

    @RequestMapping(value = "/search.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过id获取指定likes信息的方法")
    public JsonBean findById(int id, Model model){
        Hoststory hoststory = hoststoryService.findLikesById(id);
        model.addAttribute("hoststory",hoststory);

        return new JsonBean(1,hoststory);
    }
}
