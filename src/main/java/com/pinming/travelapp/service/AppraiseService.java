package com.pinming.travelapp.service;


import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.MyAppraise;

public interface AppraiseService {

    //我的好评
    R findMyAppr();
    // 编写好评
    R addAppr(MyAppraise myAppraise);
}
