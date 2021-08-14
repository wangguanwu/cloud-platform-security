package com.github.guanwu.security.modules.admin.constant;

/**
 * @author guanwu
 * @created on 2021-08-10 23:13:47
 **/
public class AdminCommonConstant {
    public final static int ROOT = -1;
    public final static int DEFAULT_GROUP_TYPE = 0;

    /**
     * 权限关联类型
     */
    public final static String AUTHORITY_TYPE_GROUP = "group";

    /**
     * 权限资源类型
     */
    public static final String RESOURCE_TYPE_MENU = "menu";
    public static final String RESOURCE_TYPE_BTN = "button";

    public static final String RESOURCE_REQUEST_METHOD_GET = "GET";
    public static final String RESOURCE_REQUEST_METHOD_PUT = "PUT";
    public static final String RESOURCE_REQUEST_METHOD_DELETEW = "DELETE";
    public static final String RESOURCE_REQUEST_METHOD_POST = "POST";

    public static final String RESOURCE_ACTION_VISIT = "访问";
    public static final String BOOLEAN_NUMBER_FALSE = "0";
    public static final String BOOLEAN_NUMBER_TRUE = "1";

    /**
     * 验证码有效期: 2 min
     */
    public static final Integer LOGIN_CAPTCHA_EXPIRATION = 2;
}
