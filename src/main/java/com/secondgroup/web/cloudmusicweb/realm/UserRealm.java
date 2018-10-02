package com.secondgroup.web.cloudmusicweb.realm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    IUserService iUserService;

    public IUserService getiUserService() {
        return iUserService;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        /*String username = (String)principals.getPrimaryPrincipal();*/
        String username=(String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(
                iUserService.findRoles(username)
        );
        authorizationInfo.setStringPermissions(
                iUserService.findPermissions(username)
        );

        return authorizationInfo;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();

       /* QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account",username);*/
        User user=iUserService.getOneByName(username);


        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }

       /* if(Boolean.TRUE.equals(user.getLocked())) {
            throw new LockedAccountException(); //帐号锁定
        }*/

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getAccount(), //用户名
                user.getPassword(),
                getName()  //realm name
        );
        return authenticationInfo;
    }
}
