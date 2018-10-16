package com.secondgroup.web.cloudmusicweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.secondgroup.web.cloudmusicweb.entity.Singer;
import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.mapper.SingerMapper;
import com.secondgroup.web.cloudmusicweb.service.ISingerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SingerServiceImpl extends ServiceImpl<SingerMapper, Singer> implements ISingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public int count(User singerCondition) {
        return singerMapper.count(singerCondition);
    }

    @Override
    public List<Singer> getPage(Integer current, Integer size, User singerCondition) {
        PageHelper.startPage(1, 10);
        List<Singer> singlist=singerMapper.getPage(singerCondition);

        return singlist;
    }
}
