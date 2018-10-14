package com.secondgroup.web.cloudmusicweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.secondgroup.web.cloudmusicweb.entity.Focus;
import com.secondgroup.web.cloudmusicweb.entity.extend.FocusExtend;
import com.secondgroup.web.cloudmusicweb.mapper.FocusMapper;
import com.secondgroup.web.cloudmusicweb.service.IFocusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Service
public class FocusServiceImpl extends ServiceImpl<FocusMapper, Focus> implements IFocusService {

    @Autowired
    private FocusMapper focusMapper;

    @Override
    public List<Focus> pageWithName(Integer current, Integer size, List condition) {
        String condition1 =null;
        String condition2=null;
        PageHelper.startPage(current,size);
        if(condition!=null){
            if (!condition.get(0).equals("")&&condition.get(0)!=null){
                condition1= ((String) condition.get(0)).trim();
            }
            if(!condition.get(1).equals("")&&condition.get(1)!=null){
                condition2 = ((String) condition.get(1)).trim();
            }
        }

        List<Focus> focusExtendList=focusMapper.pageWithName(condition1,condition2);

        return focusExtendList;
    }
}
