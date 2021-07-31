package com.github.guanwu.security.common.exception.auth;

import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.exception.BaseException;

public class ClientInvalidException extends BaseException {

    public ClientInvalidException(String message) {
        super(CommonConstants.EX_CLIENT_INVALID_CODE, message);
    }
}
