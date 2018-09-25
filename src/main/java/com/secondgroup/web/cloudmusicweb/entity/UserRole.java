package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户角色关联Id
     */
    @TableId(value = "user_role_id", type = IdType.AUTO)
    private Integer userRoleId;

    /**
     * 关联用户
     */
    @Getter
    @Setter
    private User userRoleUser;

    /**
     * 关联角色
     */
    @Getter
    @Setter
    private Role userRoleRole;


}
