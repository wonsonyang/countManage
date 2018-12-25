package com.efun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/showInfo")
    public String showUserInfo(ModelMap modelMap) {
        return "/showInfo";
    }

    @RequestMapping("/showPoint")
    public String showPoint(){
        return "/Point_manager";
    }
}
