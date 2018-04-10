package com.longchang.www.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/view")
@ResponseBody
public class ViewHandleController {

    @RequestMapping("/main")
    public String tomain(){
        return "main";
    }

}
