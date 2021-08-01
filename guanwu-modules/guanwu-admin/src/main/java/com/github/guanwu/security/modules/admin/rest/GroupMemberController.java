package com.github.guanwu.security.modules.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.GroupMemberBiz;
import com.github.guanwu.security.modules.mapper.entity.GroupMember;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("groupMember")
public class GroupMemberController extends BaseController<GroupMemberBiz,GroupMember> {

}