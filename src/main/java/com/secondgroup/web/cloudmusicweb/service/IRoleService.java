package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface IRoleService extends IService<Role> {

    /**
     * 批量删除
     * @return 删除情况
     */
    public Integer delRoles(List<Role> roles);

}
