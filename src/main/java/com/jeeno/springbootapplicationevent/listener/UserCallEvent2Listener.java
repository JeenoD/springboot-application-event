package com.jeeno.springbootapplicationevent.listener;

import com.jeeno.springbootapplicationevent.event.UserCallEvent;
import com.jeeno.springbootapplicationevent.pojo.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器 - 方式2
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 15:35
 */
@Slf4j
@Component
public class UserCallEvent2Listener implements ApplicationListener<UserCallEvent> {
    @Override
    public void onApplicationEvent(UserCallEvent userCallEvent) {
        log.debug("UserCallEvent2Listener - 方式二");
        UserDO userDO = userCallEvent.getUserDO();

        // 记录日志 - 可以存到数据库
        log.info("Insert into DB: {}", userDO);
    }
}
