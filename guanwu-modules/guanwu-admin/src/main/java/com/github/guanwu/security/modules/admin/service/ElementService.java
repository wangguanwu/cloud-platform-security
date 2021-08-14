package com.github.guanwu.security.modules.admin.service;

import com.github.guanwu.security.common.service.BaseService;
import com.github.guanwu.security.modules.admin.entity.Element;
import com.github.guanwu.security.modules.admin.mapper.ElementMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * 
 *
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 18:10:18
 */
@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class ElementService extends BaseService<ElementMapper, Element> {
    public List<Element> getAuthorityElementByUserId(String userId) {

    }
}