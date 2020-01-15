package com.jeeno.springbootapplicationevent.listener;

import com.jeeno.springbootapplicationevent.event.UserCallEvent;
import com.jeeno.springbootapplicationevent.pojo.UserDO;
import com.jeeno.springbootapplicationevent.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器 - 方式3
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 15:37
 */
@Slf4j
@Component
public class UserCallEvent3Listener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        // 只有发布事件为UserCallEvent时触发
        return aClass == UserCallEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        //只有在UserServiceImpl内发布的UserCallEvent事件时才会执行下面逻辑
        return aClass == UserServiceImpl.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.debug("UserCallEvent3Listener - 方式三");
        UserCallEvent userCallEvent = (UserCallEvent)applicationEvent;
        UserDO userDO = userCallEvent.getUserDO();

        // 记录日志 - 可以存到数据库
        log.info("Insert into DB: {}", userDO);
    }
}
