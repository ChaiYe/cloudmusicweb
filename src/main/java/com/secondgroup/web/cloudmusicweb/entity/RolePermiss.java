package com.secondgroup.web.cloudmusicweb.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RolePermiss implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色权限关联ID
     */
    @Setter
    @Getter
    private Integer rolePermissId;

    /**
     * 关联角色
     */
    @Setter
    @Getter
    private Role rolePermissRole;

    /**
     * 关联权限
     */
    @Setter
    @Getter
    private Permission rolePermissPermiss;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getRolePermissId() {
        return rolePermissId;
    }

    public void setRolePermissId(Integer rolePermissId) {
        this.rolePermissId = rolePermissId;
    }

    public Role getRolePermissRole() {
        return rolePermissRole;
    }

    public void setRolePermissRole(Role rolePermissRole) {
        this.rolePermissRole = rolePermissRole;
    }

    public Permission getRolePermissPermiss() {
        return rolePermissPermiss;
    }

    public void setRolePermissPermiss(Permission rolePermissPermiss) {
        this.rolePermissPermiss = rolePermissPermiss;
    }
}
