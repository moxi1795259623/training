package com.moxi.training.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Classname MaterialController
 * @Description 上传资料
 * @Date 2021/4/2 16:34
 * @Created by 12345678
 */
@Slf4j
@Controller
public class MaterialController {
    @GetMapping("/homework")
    public String materials() {
        log.info("进入上传作业页面");
        return "form/homework";
    }

    @PostMapping("/upload")
    public String homework(@RequestParam("email") String email,
                           @RequestParam("userName") String userName,
                           @RequestPart("homework") MultipartFile homework,
                           @RequestPart("homeworks") MultipartFile[] homeworks) {
        log.info("作业上传结果:姓名={}，大小={}，数量={}", userName, homework.getSize(), homeworks.length);
      //上传的数据还需要进一步处理。。。。。
        if(!email.isEmpty()){
            //上交的作业保存到数据库
        }
        return "main";
    }
}
