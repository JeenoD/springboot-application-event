package com.jeeno.springbootapplicationevent.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2020/1/15 14:31
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDO {

    private String name;

    private String phone;

    private Integer age;
}
