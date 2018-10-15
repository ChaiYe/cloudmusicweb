package com.secondgroup.web.cloudmusicweb.mapper;

import com.secondgroup.web.cloudmusicweb.entity.Mv;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.secondgroup.web.cloudmusicweb.entity.extend.MvExtend;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface MvMapper extends BaseMapper<Mv> {

    List<Mv> getPage(MvExtend mvCondition);

    int getCount(MvExtend mvCondition);
}
