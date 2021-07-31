package com.github.guanwu.security.common.exception;

public class BaseException extends RuntimeException{

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BaseException(int status, String message) {
        super(message);
        this.status = status;
    }

    public BaseException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
