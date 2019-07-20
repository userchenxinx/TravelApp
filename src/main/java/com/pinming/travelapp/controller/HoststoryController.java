package com.pinming.travelapp.controller;

import com.github.pagehelper.PageInfo;
import com.pinming.travelapp.pojo.Hoststory;
import com.pinming.travelapp.service.HoststoryService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-20 10:17
 **/
@RestController
@RequestMapping("/hoststory")
@CrossOrigin //跨域注解
public class HoststoryController {

    @Autowired
    HoststoryService hoststoryService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有hoststory信息的方法")
    public JsonBean listAll(Model model, @RequestParam(name = "page", required = false, defaultValue = "1") int page, @RequestParam(name = "pageSize", required = false, defaultValue = "3") int pageSize) {

        List<Hoststory> list = hoststoryService.selectAllHoststory(page, pageSize);
        PageInfo<Hoststory> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo", pageInfo);
        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过id获取指定hoststory信息的方法")
    public JsonBean selectById(int id, Model model){
        Hoststory hoststory = hoststoryService.finHoststoryById(id);
        model.addAttribute("hoststory",hoststory);

        return new JsonBean(1,hoststory);
    }
}
