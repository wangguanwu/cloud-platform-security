package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.admin.entity.GateLog;
import com.github.guanwu.security.modules.admin.service.GateLogService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("gateLog")
public class GateLogController extends BaseController<GateLogService, GateLog> {

}