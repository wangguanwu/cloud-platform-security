package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.admin.entity.ResourceAuthority;
import com.github.guanwu.security.modules.admin.service.ResourceAuthorityService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("resourceAuthority")
public class ResourceAuthorityController extends BaseController<ResourceAuthorityService, ResourceAuthority> {

}