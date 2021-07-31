package com.github.guanwu.security.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 客户端http工具
 *
 * @author guanwu
 * @created on 2021-07-30 23:04:17
 **/
public class ClientUtil {
    /**
     * 获取客户端真实ip
     * @param request
     * @return
     */
    public static String getClientIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;

    }

}
