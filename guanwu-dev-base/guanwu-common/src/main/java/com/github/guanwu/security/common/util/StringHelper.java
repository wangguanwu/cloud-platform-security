package com.github.guanwu.security.common.util;

/**
 * toString方法的封装
 *
 * @author guanwu
 * @created on 2021-07-30 16:57:59
 **/
public class StringHelper {
    public static String getObjectValue(Object obj){
        return obj==null?"":obj.toString();
    }

}
