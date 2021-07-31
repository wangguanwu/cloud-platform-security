package com.github.guanwu.security.common.exception.auth;

import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.exception.BaseException;

public class ClientTokenException extends BaseException {

    public ClientTokenException(String message) {
        super(CommonConstants.EX_CLIENT_INVALID_CODE, message);
    }
}
