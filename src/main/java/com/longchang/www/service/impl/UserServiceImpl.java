package com.longchang.www.service.impl;

import com.longchang.www.bean.ResponseBean;
import com.longchang.www.entity.User;
import com.longchang.www.entity.UserExample;
import com.longchang.www.mapper.UserMapper;
import com.longchang.www.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

     @Override
     public User checkName(String username, String password) {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);


         List<User> list = userMapper.selectByExample(userExample);

         /*与数据库匹配的两条件必须成立*/
         if(list!=null && list.size()>0){
             return list.get(0);
         }
         return null;
    }
}
