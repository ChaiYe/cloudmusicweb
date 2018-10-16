package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.Singer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.secondgroup.web.cloudmusicweb.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface ISingerService extends IService<Singer> {

    int count(User singerCondition);

    List<Singer> getPage(Integer current, Integer size, User singerCondition);
}
