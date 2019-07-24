package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.MyAppraiseMapper;
import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.MyAppraise;
import com.pinming.travelapp.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseServiceImpl implements AppraiseService {
    @Autowired
    private MyAppraiseMapper myAppraiseMapper;

    @Override
    public R findMyAppr() {
        List<MyAppraise> list = myAppraiseMapper.findAllAppr();
        return R.setOK("OK",list);
    }

    @Override
    public R addAppr(MyAppraise myAppraise) {
        myAppraiseMapper.addAppr(myAppraise);
        return R.setOK("OK",null);
    }

    @Override
    public R findByOrd(int ordernum) {
        MyAppraise myAppraise = myAppraiseMapper.findByOrd(ordernum);
        return R.setOK("OK",null);
    }

    @Override
    public R updateAppr(MyAppraise myAppraise) {
        myAppraiseMapper.updateAppr(myAppraise);
        return R.setOK("评价成功",null);
    }
}
