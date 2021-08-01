package com.github.guanwu.security.modules.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.GateLogBiz;
import com.github.guanwu.security.modules.mapper.entity.GateLog;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("gateLog")
public class GateLogController extends BaseController<GateLogBiz,GateLog> {

}