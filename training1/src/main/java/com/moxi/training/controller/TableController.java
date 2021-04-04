package com.moxi.training.controller;

import com.moxi.training.bean.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname TableController
 * @Description TODO
 * @Date 2021/4/2 13:16
 * @Created by 12345678
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String table(){
        return "table/basic_table";
    }

    @GetMapping("/teacherInfo_table")
    public String teacher_table(Model model){
        List<Teacher> teachers= Arrays.asList(
                new Teacher(1001,"张三",0,1,"研发部",0,"","12344"),
                new Teacher(1002,"张三1",1,4,"研发部",0,"des","12344"));
        model.addAttribute("teachers",teachers);
        return "table/teacherInfo_table";
    }
}
