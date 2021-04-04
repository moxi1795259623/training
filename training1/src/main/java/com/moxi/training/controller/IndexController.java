package com.moxi.training.controller;

import com.moxi.training.bean.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @Classname IndexController
 * @Description 登录请求
 * @Date 2021/4/2 10:08
 * @Created by 12345678
 */
@Slf4j
@Controller
public class IndexController {

    //访问登录页
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    /**
     * 在login页面中表单提交验证用户名密码进入主页面
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model){
        log.info("进入登录页面...");
        log.info("用户名为：{}，密码为：",user.getUserName(),user.getPassWord());
        if(StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassWord())){
            //查询数据库



            if(true){//查询成功注入loginUser,用于其他请求判断拦截
                session.setAttribute("loginUser",user);
                //如果登录后刷新表单，/login会重复提交【原因：虽然页面为main.html，但是url仍为/login】
                return "redirect:/main.html";
            }else{//查询失败
                model.addAttribute("msg","用户名密码错误");
                return "login";
            }
        }
        model.addAttribute("msg","用户名密码不能为空");
        return "login";
    }

    //重定向之后【url=/main1.html】此时再刷新，还会在/main.html中
    @GetMapping("/main.html")
    public String mainPage(){
        //真正去main页面
        log.info("进入主页面...");
        return "main";
    }
}

