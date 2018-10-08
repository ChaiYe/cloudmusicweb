package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.secondgroup.web.cloudmusicweb.entity.RolePermiss;
import com.secondgroup.web.cloudmusicweb.entity.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RoleExtend extends Role {

    /**
     * 用户角色列表
     */
    @Getter
    @Setter
    private List<UserRole> userRoles;

    /**
     * 角色权限列表
     */
    @Getter
    @Setter
    private  List<RolePermiss> rolePermisses;

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public List<RolePermiss> getRolePermisses() {
        return rolePermisses;
    }

    public void setRolePermisses(List<RolePermiss> rolePermisses) {
        this.rolePermisses = rolePermisses;
    }
}
