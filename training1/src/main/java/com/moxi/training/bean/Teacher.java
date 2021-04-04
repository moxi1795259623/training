package com.moxi.training.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Classname Teacher
 * @Description teacher实体类
 * @Date 2021/4/2 15:34
 * @Created by 12345678
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer level;
    private String dept;
    private Integer latecount;
    private String description;
    private String passWord;
}
