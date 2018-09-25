package com.secondgroup.web.cloudmusicweb.mapper;

import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.secondgroup.web.cloudmusicweb.entity.extend.RoleExtend;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface RoleMapper extends BaseMapper<Role> {

    RoleExtend selectByIdWithPermisses(Integer roleId);
}
