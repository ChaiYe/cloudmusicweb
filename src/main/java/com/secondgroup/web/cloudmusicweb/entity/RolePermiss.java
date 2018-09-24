package com.secondgroup.web.cloudmusicweb.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
    private Integer rolePermissId;

    /**
     * 关联角色
     */
    private Integer rolePermissRole;

    /**
     * 关联权限
     */
    private Integer rolePermissPermiss;


}
