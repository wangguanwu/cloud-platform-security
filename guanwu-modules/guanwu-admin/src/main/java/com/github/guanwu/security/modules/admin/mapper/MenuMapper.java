package com.github.guanwu.security.modules.admin.mapper;

import com.github.guanwu.security.modules.admin.entity.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 17:58:53
 */

public interface MenuMapper extends Mapper<Menu> {

    public List<Menu> selectMenuByAuthorityId(@Param("authorityId") String authorityId,
                                              @Param("authorityType") String authorityType);

    List<Menu> selectAuthorityMenuByUserId(@Param("userId") int userId);

    List<Menu> selectAuthoritySystemByUserId(@Param("userId") int userId);
	
}
