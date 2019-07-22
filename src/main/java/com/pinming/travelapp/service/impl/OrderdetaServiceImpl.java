package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.OrderdetaMapper;
import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.Orderdeta;
import com.pinming.travelapp.service.OrderdetaService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderdetaServiceImpl implements OrderdetaService {
    @Autowired
    private OrderdetaMapper orderdetaMapper;
    @Override
    public R findAllOrd() {
        List<Orderdeta> list = orderdetaMapper.findAllOrd();
        return R.setOK("OK",list);
    }
}
