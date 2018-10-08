package com.secondgroup.web.cloudmusicweb.mapper;

import com.secondgroup.web.cloudmusicweb.entity.Userinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface UserinfoMapper extends BaseMapper<Userinfo> {
    //添加用户信息
    public int addUserinfoById(Userinfo userinfo);
    //删除用户歌手信息
    public int delUserinfoById();
    //批量删除用户歌手信息
    public int delAllUserinfo(String message);
    //获取信息列表
    public List<Userinfo> getUserInfosList();
    //更新用户歌手信息
    public int updateUserinfo(Userinfo userinfo);
    //条件查询用户歌手（type:选择类型，msg:输入信息）
    public List<Userinfo>  getUserByType(@Param("type") String type,@Param("msg") String msg);
}
