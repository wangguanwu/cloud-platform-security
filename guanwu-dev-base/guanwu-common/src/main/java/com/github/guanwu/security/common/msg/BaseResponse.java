package com.github.guanwu.security.common.msg;


public class BaseResponse {
    private int statusCode = 200;

    private String message;

    protected Object data;

    public BaseResponse() {

    }

    public BaseResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public BaseResponse(int statusCode, String message, Object data) {
        this(statusCode, message);
        this.data = data;
    }

    public static BaseResponse createResponse(int code,
                                              String msg) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.message = msg;
        baseResponse.statusCode = code;
        return  baseResponse;
    }

    public static BaseResponse createResponse(String msg) {
        return  createResponse(200, msg);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
