package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.secondgroup.web.cloudmusicweb.mapper.UserinfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface IUserinfoService extends IService<Userinfo> {
    //用户列表
    public List<Userinfo> users();
}
