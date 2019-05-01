package com.tfjy.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tfjy.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Class_NAME UserController
 * @Auther 张明慧
 * @Date 2019/4/10 10:40
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("showName")
    @ResponseBody
    public String showName(){
       return userService.getName();
    }
}
