package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.Download;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface IDownloadService extends IService<Download> {

    List<Download> getPage(Integer current, Integer size, String condition);

    int count(String condition);
}
