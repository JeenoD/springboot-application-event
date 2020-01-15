package com.jeeno.springbootapplicationevent.controller;

import com.jeeno.springbootapplicationevent.pojo.UserDO;
import com.jeeno.springbootapplicationevent.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 14:27
 */
@RestController
public class MyController {

    @Resource
    private IUserService userService;

    @GetMapping("/call")
    public String call(UserDO userDO) {
        userService.funcCall(userDO);
        return "操作成功";
    }
}
