package com.pinming.travelapp.service;

import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.Takeadds;
import com.pinming.travelapp.pojo.User;

public interface SetportService {
    // 展示设置
    R selectSet();
    // 个人资料
    R selectByUname(String username);
    // 修改个人资料
    R findByUid(int id);
    R updateUser(User user);

    // 收件地址
    R selectAdds();
    // 添加收件地址
    void addAdds(Takeadds takeadds);
    //  删除收件地址
    R deleAddrById(int id);
    // 编辑收件地址
    R findById (int id);
    R updateAddr(Takeadds takeadds);

}
