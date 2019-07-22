package com.pinming.travelapp.controller;

import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.Takeadds;
import com.pinming.travelapp.pojo.User;
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
    // 修改个人资料
    @ApiOperation(value = "通过id查找个人资料",notes = "通过id查找个人资料")
    @ResponseBody
    @GetMapping("/set/findbyuid.do")
    public R selectByUid(int id){
        return setportService.findByUid(id);
    }
    // 个人资料
    @ApiOperation(value = "修改个人资料",notes = "修改个人资料")
    @ResponseBody
    @GetMapping("/set/uptaper.do")
    public R updateUser(User user){
        return setportService.updateUser(user);
    }

    // 收件地址
    @ApiOperation(value = "收件地址",notes = "收件地址")
    @ResponseBody
    @GetMapping("/set/adds.do")
    public R selectAdds(){
        return setportService.selectAdds();
    }

    // 添加收件地址
    @ApiOperation(value = "添加收件地址",notes = "添加收件地址")
    @ResponseBody
    @GetMapping("/set/addadds.do")
    public JsonBean addAdds(Takeadds takeadds){
        setportService.addAdds(takeadds);
        return new  JsonBean(1,null);
    }
    //  删除收件
    @ApiOperation(value = "通过id删除收件地址",notes = "删除收件地址")
    @ResponseBody
    @GetMapping("/set/dele.do")
    public R deleAddr(int id){
        return setportService.deleAddrById(id);

    }

    // 编辑收件地址
    @ApiOperation(value = "通过id查找收件地址",notes = "查找收件地址")
    @ResponseBody
    @PostMapping("/set/findbyid.do")
    public R findById(int id){
        return setportService.findById(id);
    }

    @ApiOperation(value = "通过id编辑收件地址",notes = "编辑收件地址")
    @ResponseBody
    @PostMapping("/set/updateadds.do")
    public R updateAddr(Takeadds takeadds){
        return setportService.updateAddr(takeadds);
    }
}
