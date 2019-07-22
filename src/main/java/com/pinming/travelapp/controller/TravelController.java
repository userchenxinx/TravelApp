package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Travel;
import com.pinming.travelapp.service.TravelService;
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
 * @create: 2019-07-19 08:41
 **/
@RestController
@RequestMapping("/travel")
@CrossOrigin  //跨域注解
@Api(value = "展示旅游攻略信息", tags ="旅游攻略")
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
     * @return list
     */

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value="该方法是通过分页获取所有travel信息的方法")
    public JsonBean findByPage(int page, Integer type, String info){
        VPageInfo<Travel> pageInfo = travelService.findByPage(page, type, info);

        return new JsonBean(1, pageInfo);

    }

    /**
     * 控制层通过id展示指定的travel信息
     * @param id
     * @param model
     * @return travel
     */
    @RequestMapping(value = "/search.do", method = RequestMethod.GET)
    @ApiOperation(value="该方法是通过id查询likes的信息的方法")
    public JsonBean findtById(int id, Model model){
        Travel travel = travelService.findTravelById(id);
        //System.out.println(travel+"++++++-");
        //System.out.println(id);
        model.addAttribute("travel", travel);
        return new JsonBean(1, travel);
    }

}
