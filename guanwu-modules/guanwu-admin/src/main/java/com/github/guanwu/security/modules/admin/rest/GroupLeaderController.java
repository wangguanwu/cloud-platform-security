package com.github.guanwu.security.modules.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.GroupLeaderBiz;
import com.github.guanwu.security.modules.mapper.entity.GroupLeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("groupLeader")
public class GroupLeaderController extends BaseController<GroupLeaderBiz,GroupLeader> {

}