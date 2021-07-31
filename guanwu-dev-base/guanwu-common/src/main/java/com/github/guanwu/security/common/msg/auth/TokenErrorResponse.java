package com.github.guanwu.security.common.msg.auth;

import com.github.guanwu.security.common.constant.RestCodeConstants;
import com.github.guanwu.security.common.msg.BaseResponse;

public class TokenErrorResponse extends BaseResponse {

    public TokenErrorResponse(String msg) {
         super(RestCodeConstants.TOKEN_ERROR_CODE, msg);
    }
}
