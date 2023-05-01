package com.qiao.controller;

import com.qiao.dto.Aliyun;
import com.qiao.entity.User;
import com.qiao.exception.MyEnum;
import com.qiao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TestController {
    @Autowired
    private Aliyun aliyun;

    @Autowired
    private UserService userService;

    private static final Logger  logger= LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hi")
    public List<User> hi(){
        List<User> list = userService.list();
        System.out.println("aaagit ");
        System.out.println("yyyyyyyy");
        return list;
    }
}
