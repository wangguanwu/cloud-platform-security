package com.github.guanwu.security.common.exception.auth;

import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.exception.BaseException;

public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(CommonConstants.EX_USER_INVALID_CODE,message);
    }
}
