package com.jeeno.springbootapplicationevent.service;

import com.jeeno.springbootapplicationevent.pojo.UserDO;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 14:27
 */
public interface IUserService {

    /**
     * 调用业务接口实现
     * @param userDO 用户信息
     */
    void funcCall(UserDO userDO);
}
