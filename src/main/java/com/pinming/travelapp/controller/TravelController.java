package com.pinming.travelapp.controller;

import com.github.pagehelper.PageInfo;
import com.pinming.travelapp.pojo.Travel;
import com.pinming.travelapp.service.TravelService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-19 08:41
 **/
@RestController
@RequestMapping("/travel")
@CrossOrigin  //跨域注解
public class TravelController {

    @Autowired
    TravelService travelService;

    /**
     * 控制层通过id展示指定的travel信息
     * @param id
     * @param model
     * @return travel
     */
    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
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
    @ApiOperation(value="该方法是通过分页获取所有travel信息的方法")
    public JsonBean listAll(Model model, @RequestParam(name = "page",required = false,defaultValue = "1") int page, @RequestParam(name = "pageSize",required = false,defaultValue = "3") int pageSize){

        List<Travel> list = travelService.selectAllTravel(page, pageSize);
        //System.out.println(list);
        PageInfo<Travel> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo", pageInfo);
        return new JsonBean (1,list);
    }

}
