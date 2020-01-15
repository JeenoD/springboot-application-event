package com.jeeno.springbootapplicationevent.listener;

import com.jeeno.springbootapplicationevent.event.UserCallEvent;
import com.jeeno.springbootapplicationevent.pojo.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器 - 方式1
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 14:37
 */
@Slf4j
@Component
public class UserCallEvent1Listener {

    @EventListener
    public void callEventLog(UserCallEvent userCallEvent) {
        log.debug("UserCallEventListener - 方式一");
        UserDO userDO = userCallEvent.getUserDO();

        // 记录日志 - 可以存到数据库
        log.info("Insert into DB: {}", userDO);
    }

}
