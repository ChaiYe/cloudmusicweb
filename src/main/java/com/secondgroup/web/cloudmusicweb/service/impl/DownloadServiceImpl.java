package com.secondgroup.web.cloudmusicweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.secondgroup.web.cloudmusicweb.entity.Download;
import com.secondgroup.web.cloudmusicweb.mapper.DownloadMapper;
import com.secondgroup.web.cloudmusicweb.service.IDownloadService;
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
public class DownloadServiceImpl extends ServiceImpl<DownloadMapper, Download> implements IDownloadService {

    @Autowired
    private DownloadMapper downloadMapper;

    @Override
    public List<Download> getPage(Integer current, Integer size, String condition) {
        PageHelper.startPage(current, size);
        List<Download> downloads= downloadMapper.getPage(condition);
        return downloads;
    }

    @Override
    public int count(String condition) {
        return 0;
    }
}
