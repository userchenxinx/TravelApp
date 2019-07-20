package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Comment;
import com.pinming.travelapp.service.CommentService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-07-20 15:33
 **/
@RestController
@RequestMapping("/comment")
@CrossOrigin  //跨域注解
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation("该方法是获取所有评论信息的方法")
    public JsonBean selectAll(Model model){
        List<Comment> list = commentService.selectAllComment();
        model.addAttribute("list", list);

        return new JsonBean(1,list);
    }
}
