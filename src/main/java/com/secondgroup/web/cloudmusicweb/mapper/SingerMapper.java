package com.secondgroup.web.cloudmusicweb.mapper;

import com.secondgroup.web.cloudmusicweb.entity.Singer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.secondgroup.web.cloudmusicweb.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface SingerMapper extends BaseMapper<Singer> {

    int count(User singerCondition);

    List<Singer> getPage(User singerCondition);
}
