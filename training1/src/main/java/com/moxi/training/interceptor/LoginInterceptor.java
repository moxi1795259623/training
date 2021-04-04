package com.moxi.training.interceptor;

import com.moxi.training.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @Classname LoginInterceptor
 * @Description 登录拦截检查
 * @Date 2021/4/2 11:00
 * @Created by 12345678
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    String
    @Override  //获取登录的信息，判断是否是合法的登录
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       User loginUser =(User)request.getSession().getAttribute("loginUser");
        if(loginUser!=null) return true;
        //否则 还未登录
        log.info("拦截的请求有：{}",request.getRequestURI());
        request.setAttribute("msg","请先登录");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }
}
