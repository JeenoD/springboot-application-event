package com.jeeno.springbootapplicationevent.event;

import com.jeeno.springbootapplicationevent.pojo.UserDO;
import org.springframework.context.ApplicationEvent;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 14:30
 */
public class UserCallEvent extends ApplicationEvent {

    private UserDO userDO;

    public UserCallEvent(Object source, UserDO userDO) {
        super(source);
        this.userDO = userDO;
    }

    public UserDO getUserDO() {
        return userDO;
    }

    public void setUserDO(UserDO userDO) {
        this.userDO = userDO;
    }

}
