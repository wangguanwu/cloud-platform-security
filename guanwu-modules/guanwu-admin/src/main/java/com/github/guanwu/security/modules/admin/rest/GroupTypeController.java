package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.GroupTypeBiz;
import com.github.guanwu.security.modules.mapper.entity.GroupType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("groupType")
public class GroupTypeController extends BaseController<GroupTypeBiz,GroupType> {

}