package com.github.guanwu.security.configuration;

import com.github.guanwu.security.common.handler.GlobalExceptionHandler;
import com.github.guanwu.security.modules.auth.interceptor.UserAuthRestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Collections;

@Configuration("adminWebConfig")
@Primary
public class WebConfiguration implements WebMvcConfigurer {

    private final UserAuthRestInterceptor userAuthRestInterceptor;

    public WebConfiguration(UserAuthRestInterceptor userAuthRestInterceptor) {
        this.userAuthRestInterceptor = userAuthRestInterceptor;
    }

    @Bean
    public GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userAuthRestInterceptor).addPathPatterns(getIncludePathPatterns());
    }

    /**
     * 需要用户和服务认证判断的路径
     * @return
     */
    private ArrayList<String> getIncludePathPatterns() {
        ArrayList<String> list = new ArrayList<>();
        String[] urls = {
                "/element/**",
                "/gateLog/**",
                "/group/**",
                "/groupType/**",
                "/menu/**",
                "/user/**",
                "/api/permissions",
                "/api/user/un/**",
                "/service/**"
        };
        Collections.addAll(list, urls);
        return list;
    }

}
