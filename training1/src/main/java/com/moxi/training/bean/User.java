package com.moxi.training.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Classname User
 * @Description 用户登录信息
 * @Date 2021/4/2 10:47
 * @Created by 12345678
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String userName;
    private String passWord;
}
