package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.entity.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserExtend extends User {

    /**
     * 用户的角色
     */
    @Getter
    @Setter
    List<UserRole> userRoles;

}
