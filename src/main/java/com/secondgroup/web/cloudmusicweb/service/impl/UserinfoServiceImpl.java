package com.secondgroup.web.cloudmusicweb.service.impl;

import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.entity.Userinfo;
import com.secondgroup.web.cloudmusicweb.mapper.UserinfoMapper;
import com.secondgroup.web.cloudmusicweb.service.IUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public List<Userinfo> users() {
        List<Userinfo> users = userinfoMapper.selectList(null);
        return users;
    }
}
