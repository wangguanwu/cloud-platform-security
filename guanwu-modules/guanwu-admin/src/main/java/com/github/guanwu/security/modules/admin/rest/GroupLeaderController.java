package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.admin.entity.GroupLeader;
import com.github.guanwu.security.modules.admin.service.GroupLeaderService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("groupLeader")
public class GroupLeaderController extends BaseController<GroupLeaderService, GroupLeader> {

}