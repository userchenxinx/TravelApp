package com.pinming.travelapp.service;

import com.pinming.travelapp.model.R;

public interface SetportService {
    // 展示设置
    R selectSet();
    // 个人资料
    R selectByUname(String username);

}
