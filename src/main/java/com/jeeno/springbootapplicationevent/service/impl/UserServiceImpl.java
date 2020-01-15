package com.jeeno.springbootapplicationevent.service.impl;

import com.jeeno.springbootapplicationevent.event.UserCallEvent;
import com.jeeno.springbootapplicationevent.pojo.UserDO;
import com.jeeno.springbootapplicationevent.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户业务接口实现类
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 14:28
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void funcCall(UserDO userDO) {
        // TODO 此处执行业务执行逻辑

        // 发布事件
        applicationContext.publishEvent(new UserCallEvent(this, userDO));
    }
}
