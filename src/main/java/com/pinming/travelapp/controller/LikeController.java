package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Like;
import com.pinming.travelapp.pojo.TravelLog;
import com.pinming.travelapp.service.LikeService;
import com.pinming.travelapp.service.TravelLogService;
import com.pinming.travelapp.util.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-20 14:48
 **/
@RestController
@RequestMapping("/like")
@Api(value = "该类是旅行故事点赞相关",tags ="该类是旅行故事点赞相关")
//解决跨域
@CrossOrigin
public class LikeController {

    @Autowired
    private LikeService likeService;
    @Autowired
    TravelLogService travelLogService;

    //添加事务支持
    @Transactional
    @RequestMapping("/add.do")
    @ApiOperation("该方法是判断旅行故事点赞的方法")
    public JsonBean great(@ApiParam("该参数代表点赞表的参数") Like like2){
        //查询是否有该用户对该故事的点赞记录
        List<Like> list = likeService.findByTidAndUid(like2.getTid(),like2.getUid());
        TravelLog travelLog=null;
        if (list.size()>0 && list != null){
            //如果找到了这条记录，则删除该记录，同时文章的点赞数减1
            Like like = list.get(0);
            //删除记录
            likeService.deleteById(like.getId());
            //文章点赞数减1，查询时使用Mysql行级锁解决并发覆盖问题
            travelLog = travelLogService.findByIdForUpdate(like2.getTid());
            /*travelLog.setLikenum(travelLog.getLikenum()-1);*/
            travelLogService.delAndFlush(travelLog.getId());
            return new JsonBean(0,"取消点赞");
        }else {
            //如果没有找到这条记录，则添加这条记录，同时文章点赞数加1
            Like like1=new Like();
            like1.setTid(like2.getTid());
            like1.setUid(like2.getUid());

            //添加记录
            likeService.saveAndFlush(like1);
            //故事点赞数加1，查询时使用Mysql行级锁解决并发覆盖问题
            travelLog = travelLogService.findByIdForUpdate(like2.getTid());
           /* travelLog.setLikenum(travelLog.getLikenum()+1);*/
            travelLogService.saveAndFlush(travelLog.getId());
            return new JsonBean(1,"点赞");
        }

    }

}


