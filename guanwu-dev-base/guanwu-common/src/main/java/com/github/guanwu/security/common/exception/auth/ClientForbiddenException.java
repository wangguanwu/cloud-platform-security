package com.github.guanwu.security.common.exception.auth;

import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.exception.BaseException;

public class ClientForbiddenException extends BaseException {

    public ClientForbiddenException(String message) {
        super(CommonConstants.EX_CLIENT_FORBIDDEN_CODE, message);
    }
}
