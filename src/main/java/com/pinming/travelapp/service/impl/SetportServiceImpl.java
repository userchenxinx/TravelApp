package com.pinming.travelapp.service.impl;

import com.pinming.travelapp.mapper.SetportMapper;
import com.pinming.travelapp.mapper.TakeaddsMapper;
import com.pinming.travelapp.mapper.UserMapper;
import com.pinming.travelapp.model.Person;
import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.Setport;
import com.pinming.travelapp.pojo.Takeadds;
import com.pinming.travelapp.pojo.User;
import com.pinming.travelapp.service.SetportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetportServiceImpl implements SetportService {

    @Autowired
    private SetportMapper setportMapper;


    @Override
    public R selectSet() {
        List<Setport> list= setportMapper.findSet();
        return R.setOK("OK",list);
    }

    @Override
    public R selectByUname(String username) {
        List<Person> list = setportMapper.findByUname(username);
        return R.setOK("OK",list);
    }

    @Override
    public R findByUid(int id) {
        User user = setportMapper.findByUid(id);
        return R.setOK("OK",user);
    }

    @Override
    public R updateUser(User user) {
        setportMapper.updateUser(user);
        return R.setOK("修改成功",null);
    }

    @Override
    public R selectAdds() {
        List<Takeadds> list = setportMapper.findAdds();
        return R.setOK("OK",list);
    }

    @Override
    public void addAdds(Takeadds takeadds) {
        setportMapper.addAdds(takeadds);

    }

    @Override
    public R deleAddrById(int id) {
        setportMapper.delectAddr(id);
        return R.setOK();
    }

    @Override
    public R findById(int id) {
        Takeadds takeadds = setportMapper.findById(id);
        return R.setOK("OK",takeadds);
    }

    @Override
    public R updateAddr(Takeadds takeadds) {
        setportMapper.update(takeadds);
        return R.setOK("修改成功",null);
    }


}
