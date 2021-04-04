package com.moxi.training.config;

import com.moxi.training.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @Classname AdminConfig
 * @Description 配置类：拦截器
 * @Date 2021/4/2 11:10
 * @Created by 12345678
 */
@Configuration
public class AdminConfig implements WebMvcConfigurer {
    @Override  //注册自定义的拦截器并设置拦截路径
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(Arrays.asList("/","/login","/css/**","/fonts/**","/images/**","/js/**","/druid/**"));
    }
}
