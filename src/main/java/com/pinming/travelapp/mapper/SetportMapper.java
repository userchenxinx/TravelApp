package com.pinming.travelapp.mapper;


import com.pinming.travelapp.model.Person;
import com.pinming.travelapp.model.R;
import com.pinming.travelapp.pojo.Setport;
;
import com.pinming.travelapp.pojo.Takeadds;
import com.pinming.travelapp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SetportMapper {
    // 设置
    List<Setport> findSet();
    // 个人资料
    List<Person> findByUname(String username);
    // 修改个人资料
    User findByUid(int id);
    void updateUser(User user);
    // 收件地址
    List<Takeadds> findAdds();
    // 添加收件地址
    void addAdds(Takeadds takeadds);

    // 删除收件地址
    void delectAddr(int id);
    // 编辑收件地址
    Takeadds findById(int id);
    void update(Takeadds takeadds);
}