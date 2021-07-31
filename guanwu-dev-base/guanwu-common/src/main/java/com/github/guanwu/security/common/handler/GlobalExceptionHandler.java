package com.github.guanwu.security.common.handler;


import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.exception.BaseException;
import com.github.guanwu.security.common.exception.auth.ClientTokenException;
import com.github.guanwu.security.common.exception.auth.UserInvalidException;
import com.github.guanwu.security.common.msg.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice("com.github.guanwu.security")
@ResponseBody
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(ClientTokenException.class)
    public BaseResponse userTokenExceptionHandler(HttpServletResponse response, ClientTokenException clientTokenException) {
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        logger.error(clientTokenException.getMessage(), clientTokenException);
        return new BaseResponse(clientTokenException.getStatus(), clientTokenException.getMessage());
    }

    @ExceptionHandler(UserInvalidException.class)
    public BaseResponse userInvalidExceptionHandler(HttpServletResponse response, UserInvalidException userInvalidException) {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        logger.error(userInvalidException.getMessage(), userInvalidException);
        return new BaseResponse(userInvalidException.getStatus(), userInvalidException.getMessage());
    }

    @ExceptionHandler(BaseException.class)
    public BaseResponse baseExceptionHandler(HttpServletResponse response, BaseException ex) {
        logger.error(ex.getMessage(), ex);
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse otherExceptionHandler(HttpServletResponse response, Exception ex) {
        logger.error(ex.getMessage(), ex);
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return new BaseResponse(CommonConstants.EX_OTHER_CODE, ex.getMessage());
    }

}
