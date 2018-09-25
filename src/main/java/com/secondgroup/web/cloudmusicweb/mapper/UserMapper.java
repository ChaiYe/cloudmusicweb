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

    public Integer selectlastId();


    UserExtend getUserByusername(String username);

    User getOneByName(String username);
}
