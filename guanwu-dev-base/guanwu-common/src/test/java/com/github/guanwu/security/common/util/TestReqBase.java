package com.github.guanwu.security.common.util;

/**
 * 基类
 *
 * @author guanwu
 * @created on 2021-07-31 11:04:26
 **/
public class TestReqBase<T>{
    protected T data;
    private String name;
    public void sayHello() {
        System.out.println("hello , " + name);
        System.out.println(data.toString());
    }

    private void sayHi() {
        System.out.println("hi..." + name);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
