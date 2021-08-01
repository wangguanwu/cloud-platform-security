package com.github.guanwu.security.modules.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.ResourceAuthorityBiz;
import com.github.guanwu.security.modules.mapper.entity.ResourceAuthority;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("resourceAuthority")
public class ResourceAuthorityController extends BaseController<ResourceAuthorityBiz,ResourceAuthority> {

}