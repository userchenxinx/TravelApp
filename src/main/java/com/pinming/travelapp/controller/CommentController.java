package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Comment;
import com.pinming.travelapp.service.CommentService;
import com.pinming.travelapp.util.JsonBean;
import com.pinming.travelapp.util.VPageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jie
 * @create: 2019-07-20 15:33
 **/
@RestController
@RequestMapping("/comment")
@CrossOrigin  //跨域注解
@Api(value = "展示评论信息", tags ="评论信息..")
public class CommentController {

    @Autowired
    CommentService commentService;

//    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
//    @ApiOperation("该方法是获取所有评论信息的方法")
//    public JsonBean selectAll(Model model){
//        List<Comment> list = commentService.selectAllComment();
//        model.addAttribute("list", list);
//
//        return new JsonBean(1,list);
//    }

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有评论信息的方法,需要传页数参数")
    public JsonBean findByPage(int page, Integer type, String info){
        VPageInfo<Comment> pageInfo = commentService.findByPage(page, type, info);

        return new JsonBean(1, pageInfo);

    }



}
