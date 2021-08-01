package com.github.guanwu.security.common.rest;

import com.github.guanwu.security.common.context.BaseContextHandler;
import com.github.guanwu.security.common.msg.BaseResponse;
import com.github.guanwu.security.common.msg.GenericResponse;
import com.github.guanwu.security.common.msg.TableResultResponse;
import com.github.guanwu.security.common.service.BaseService;
import com.github.guanwu.security.common.util.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.common.Mapper;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 处理器基类
 *
 * @author guanwu
 * @created on 2021-07-31 21:56:14
 **/

@Slf4j
@RestController
public class BaseController<Service extends BaseService<M ,Entity>, Entity, M extends Mapper<Entity>> {

    protected final HttpServletRequest request;

    protected final Service baseService;


    public BaseController(HttpServletRequest httpServletRequest, Service baseService) {
        this.request = request;
        this.baseService = baseService;
    }

    @PostMapping(value = "")
    public BaseResponse add(@RequestBody Entity entity) {
        baseService.insertSelective(entity);
        return new GenericResponse<>();
    }

    @GetMapping(value="/{id}")
    public BaseResponse get(@PathVariable(name = "id") Integer id) {
        GenericResponse<Entity> response = new GenericResponse<>();
        Entity entity = baseService.selectById(id);
        response.data(entity);
        return response;
    }

    @PutMapping(value = "/{id}")
    public GenericResponse<Entity> update(@RequestBody Entity entity) {
        baseService.updateSelectiveById(entity);
        return new GenericResponse<>();
    }

    @DeleteMapping(value = "/{id}")
    public BaseResponse deleteByid(@PathVariable("id") Integer id) {
        baseService.deleteById(id);
        return new BaseResponse();
    }

    @GetMapping("/all")
    public GenericResponse<Entity> list(@RequestParam Map<String, Object> params) {
        return (GenericResponse<Entity>) new GenericResponse<>().data(baseService.selectListAll());
    }

    @GetMapping("/page")
    public TableResultResponse<Entity> pageList(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        return baseService.selectByQuery(query);
    }

    public String getCurrentUserName() {
        return BaseContextHandler.getUsername();
    }

}
