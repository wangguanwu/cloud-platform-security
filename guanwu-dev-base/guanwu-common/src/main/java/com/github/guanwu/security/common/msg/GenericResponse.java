package com.github.guanwu.security.common.msg;

public class GenericResponse<T> extends BaseResponse{

    public GenericResponse() {
    }

    public GenericResponse(int statusCode, String message, T data) {
        super(statusCode, message, data);
    }

    @Override
    public T getData() {
        return (T)super.getData();
    }

    public GenericResponse<T> data(T data) {
        super.setData((Object) data);
        return this;
    }
}
