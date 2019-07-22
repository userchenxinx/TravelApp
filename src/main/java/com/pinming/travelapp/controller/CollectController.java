package com.pinming.travelapp.controller;

import com.pinming.travelapp.pojo.Collect;
import com.pinming.travelapp.pojo.TravelLog;
import com.pinming.travelapp.service.CollectService;
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
 * @create: 2019-07-22 20:07
 **/
@RestController
@RequestMapping("/collection")
@Api(value = "该类是旅行故事收藏相关",tags ="该类是旅行故事收藏相关")
//解决跨域
@CrossOrigin
public class CollectController {

    @Autowired
    private CollectService collectService;
    @Autowired
    private TravelLogService travelLogService;

    //添加事务支持
    @Transactional
    @RequestMapping("/add.do")
    @ApiOperation("该方法是判断旅行故事收藏的方法")
    public JsonBean great(@ApiParam("该参数代表收藏表的参数")Collect collect2){
        //查询是否有该用户收藏该故事的记录
        List<Collect> list = collectService.findByTidAndUid(collect2.getTid(),collect2.getUid());
        TravelLog travelLog=null;
        if (list.size()>0 && list != null){
            //如果找到了这条记录，则删除该记录，同时文章的收藏数减1
            Collect collect = list.get(0);
            //删除记录
            collectService.deleteById(collect.getId());
            //文章收藏数减1，查询时使用Mysql行级锁解决并发覆盖问题
            travelLog = travelLogService.findByIdForUpdate(collect2.getTid());
            /*travelLog.setLikenum(travelLog.getLikenum()-1);*/
            travelLogService.reduceAndFlush(travelLog.getId());
            return new JsonBean(0,"取消收藏");
        }else {
            //如果没有找到这条记录，则添加这条记录，同时文章收藏数加1
            Collect collect1=new Collect();
            collect1.setTid(collect2.getTid());
            collect1.setUid(collect2.getUid());

            //添加记录
            collectService.saveAndFlush(collect1);
            //故事收藏数加1，查询时使用Mysql行级锁解决并发覆盖问题
            travelLog = travelLogService.findByIdForUpdate(collect2.getTid());
            /* travelLog.setLikenum(travelLog.getLikenum()+1);*/
            travelLogService.addAndFlush(travelLog.getId());
            return new JsonBean(1,"收藏");
        }

    }




}
