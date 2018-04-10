package com.longchang.www.controller;

import com.longchang.www.bean.ResponseBean;
import com.longchang.www.entity.User;
import com.longchang.www.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public ResponseBean login(String username, String password, HttpSession session){
        /*验证数据库用户名和密码*/
        User user = userService.checkName(username,password);
        if (user == null){
            return new ResponseBean(HttpStatus.UNAUTHORIZED.value(),"对不起您的用户名或密码出错");
        }else {
            /*保存登录会话*/
            session.setAttribute("loginTalk",user);

            return new ResponseBean(0,"登录成功");
        }
    }
}

