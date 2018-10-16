package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface IUserService extends IService<User> {

    Set<String>  findRoles( String username);

    Set<String>  findPermissions(String username);

    User getOneByName(String username);

    List<User> getPage(Integer current, Integer size, User userCondition);

    List<Map<String,String>> analysisAge();
}
