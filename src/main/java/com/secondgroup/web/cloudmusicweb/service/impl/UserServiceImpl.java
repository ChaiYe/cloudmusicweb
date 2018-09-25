package com.secondgroup.web.cloudmusicweb.service.impl;

import com.secondgroup.web.cloudmusicweb.entity.*;
import com.secondgroup.web.cloudmusicweb.entity.extend.RoleExtend;
import com.secondgroup.web.cloudmusicweb.entity.extend.UserExtend;
import com.secondgroup.web.cloudmusicweb.mapper.RoleMapper;
import com.secondgroup.web.cloudmusicweb.mapper.UserMapper;
import com.secondgroup.web.cloudmusicweb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public RoleMapper roleMapper;

    @Override
    public Set<String> findRoles(String username) {
        Set<String> roles=new HashSet<String>();
        UserExtend u=userMapper.getUserByusername(username);
        List<UserRole> userRoles=u.getUserRoles();

        for(UserRole ur:userRoles){
            Role r=ur.getUserRoleRole();
            roles.add(r.getRoleName());
        }

        return roles;
    }

    @Override
    public Set<String> findPermissions(String username) {
        Set<String> permissions=new HashSet<String>();
        UserExtend u=userMapper.getUserByusername(username);
        List<UserRole> user_roles=u.getUserRoles();
        for(UserRole ur:user_roles){
            RoleExtend role=roleMapper.selectByIdWithPermisses(ur.getUserRoleRole().getRoleId());
            List <RolePermiss> rps=role.getRolePermisses();
            for(RolePermiss rp:rps){
                String permission=rp.getRolePermissPermiss().getPermission();
                permissions.add(permission);
            }
        }
        return permissions;
    }

    @Override
    public User getOneByName(String username) {
        return userMapper.getOneByName(username);
    }
}
