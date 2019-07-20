package com.pinming.travelapp.controller;

import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.Takeadds;
import com.pinming.travelapp.service.SetportService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
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

    // 收件地址
    @ApiOperation(value = "收件地址",notes = "收件地址")
    @ResponseBody
    @GetMapping("/set/adds.do")
    public R selectAdds(){
        return setportService.selectAdds();
    }

    // 收件地址
    @ApiOperation(value = "添加收件地址",notes = "添加收件地址")
    @ResponseBody
    @PostMapping("/set/adds.do")
    public JsonBean addAdds(Takeadds takeadds){
        setportService.addAdds(takeadds);
        return new  JsonBean(1,null);
    }


    // 编辑收件地址
    @ApiOperation(value = "编辑收件地址",notes = "编辑收件地址")
    @ResponseBody
    @PostMapping("/set/updateadds.do")
    public JsonBean updateAddr(Takeadds takeadds){
        setportService.updateAddr(takeadds);
        return new JsonBean(1,null);
    }
}
