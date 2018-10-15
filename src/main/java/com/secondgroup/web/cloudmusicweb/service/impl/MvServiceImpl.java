package com.secondgroup.web.cloudmusicweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.secondgroup.web.cloudmusicweb.entity.Mv;
import com.secondgroup.web.cloudmusicweb.entity.extend.MvExtend;
import com.secondgroup.web.cloudmusicweb.mapper.MvMapper;
import com.secondgroup.web.cloudmusicweb.service.IMvService;
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
public class MvServiceImpl extends ServiceImpl<MvMapper, Mv> implements IMvService {

    @Autowired
    private MvMapper mvMapper;

    @Override
    public List<Mv> getPage(Integer current, Integer size, MvExtend mvCondition) {
        PageHelper.startPage(current, size);
        List<Mv> mvList=mvMapper.getPage(mvCondition);
        return mvList;
    }

    @Override
    public int count(MvExtend mvCondition) {
        return mvMapper.getCount(mvCondition);
    }
}
