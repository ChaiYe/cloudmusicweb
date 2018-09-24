package com.secondgroup.web.cloudmusicweb.service.impl;

import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.secondgroup.web.cloudmusicweb.mapper.RoleMapper;
import com.secondgroup.web.cloudmusicweb.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Integer delRoles(List<Role> roles) {

        try {
            for (Role role:roles) {
                roleMapper.deleteById(role.getRoleId());
            }
        }catch (Exception e){
            return 0;
        }

        return 1;
    }
}
