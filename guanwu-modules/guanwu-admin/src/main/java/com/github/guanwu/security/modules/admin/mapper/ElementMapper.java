package com.github.guanwu.security.modules.admin.mapper;

import com.github.guanwu.security.modules.admin.entity.Element;
import com.github.guanwu.security.modules.auth.entity.Client;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 18:10:18
 */

public interface ElementMapper extends Mapper<Element> {

    List<Element> selectAuthorityElementByUserId(@Param("userId") String userId);
    List<Element> selectAuthorityMenuElementByUserId(@Param("userId") String userId,
                                                 @Param("menuId") String menuId);
    List<Element> selectAuthorityElementByClientId(@Param("clientId") String clientId);
    List<Element> selectAllElementPermissions();
	
}
