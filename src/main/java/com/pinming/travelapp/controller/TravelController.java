package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Travel;
import com.pinming.travelapp.service.TravelService;
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
 * @create: 2019-07-19 08:41
 **/
@RestController
@RequestMapping("/travel")
public class TravelController {

    @Autowired
    TravelService travelService;

    /**
     * 控制层通过id展示指定的travel信息
     * @param id
     * @param model
     * @return travel
     */
    @RequestMapping("/query.do")
    @ApiOperation(value="该方法是通过id查询travel的信息的方法")
    public JsonBean selectById(int id, Model model){
        Travel travel = travelService.selectTravelById(id);
        //System.out.println(travel+"++++++-");
        //System.out.println(id);
        model.addAttribute("travel", travel);
        return new JsonBean(1, travel);
    }

    /**
     * 控制层展示所有的travel信息
     * @param model
     * @return list
     */

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value="该方法是获取所有travel信息的方法")
    public JsonBean selectAll(Model model){

        List<Travel> list = travelService.selectAllTravel();
        //System.out.println(list);
        model.addAttribute("list", list);
        return new JsonBean (1,list);
    }

}
