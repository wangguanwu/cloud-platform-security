package com.github.guanwu.security.common.exception.auth;

import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.exception.BaseException;

public class UserInvalidException extends BaseException {

    public UserInvalidException(String message) {
        super(CommonConstants.EX_USER_INVALID_CODE, message);
    }
}
