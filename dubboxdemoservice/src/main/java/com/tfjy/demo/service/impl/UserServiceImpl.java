package com.tfjy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tfjy.demo.service.UserService;

/**
 * @Class_NAME UserServiceImpl
 * @Auther 张明慧
 * @Date 2019/4/10 09:46
 */

@Service
public class UserServiceImpl implements UserService{


    @Override
    public String getName() {
        return "你好";
    }
}
