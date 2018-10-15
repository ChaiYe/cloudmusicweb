package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.Mv;
import com.baomidou.mybatisplus.extension.service.IService;
import com.secondgroup.web.cloudmusicweb.entity.extend.MvExtend;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface IMvService extends IService<Mv> {

    List<Mv> getPage(Integer current, Integer size, MvExtend mvCondition);

    int count(MvExtend mvCondition);
}
