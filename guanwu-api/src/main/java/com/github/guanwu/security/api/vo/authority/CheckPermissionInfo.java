package com.github.guanwu.security.api.vo.authority;

import lombok.Data;

/**
 * @author guanwu
 * @created on 2021-08-11 21:14:48
 **/

@Data
public class CheckPermissionInfo {

    private PermissionInfo permissionInfo;

    private boolean isAuth;
}
