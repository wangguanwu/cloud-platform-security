package com.github.guanwu.security.common.util;

/**
 * Ceshi
 *
 * @author guanwu
 * @created on 2021-07-31 10:46:56
 **/
public class TestReqData extends TestReqBase<String>{

    public TestReqData() {
        this.data = "first";
    }

    private String shit;

    public String getShit() {
        return shit;
    }

    public void setShit(String shit) {
        this.shit = shit;
    }
}
