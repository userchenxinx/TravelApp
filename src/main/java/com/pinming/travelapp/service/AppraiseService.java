package com.pinming.travelapp.service;


import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.MyAppraise;

public interface AppraiseService {

    //我的好评
    R findMyAppr();
    // 添加好评
    R addAppr(MyAppraise myAppraise);
    // 编写好评
    R findByOrd (int ordernum);
    R updateAppr(MyAppraise myAppraise);

}
