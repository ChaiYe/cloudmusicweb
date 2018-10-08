package com.secondgroup.web.cloudmusicweb.mapper;

import com.secondgroup.web.cloudmusicweb.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.secondgroup.web.cloudmusicweb.entity.extend.UserExtend;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface UserMapper extends BaseMapper<User> {

    //通过名字获取用户信息和角色
    UserExtend getUserByusername(String username);
    //通过名字获取用户信息
    User getOneByName(String username);

    //添加用户信息
    //修改用户信息
    //删除用户信息

}
