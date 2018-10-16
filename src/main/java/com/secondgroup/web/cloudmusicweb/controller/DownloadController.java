package com.secondgroup.web.cloudmusicweb.controller;


import com.secondgroup.web.cloudmusicweb.entity.Download;
import com.secondgroup.web.cloudmusicweb.entity.extend.MvExtend;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.service.IDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jnlp.DownloadService;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@RestController
@RequestMapping("/download")
public class DownloadController {
    @Autowired
    private IDownloadService downloadService;

    @RequestMapping("/download_page")
    public Grid<Download> getDownload(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, @RequestParam(value="condition", defaultValue = "") String condition , HttpSession session) {

        List<Download>  list=downloadService.getPage(current,size,condition);
        int count = downloadService.count(condition);

        Grid<Download> downloadGrid=new Grid<>();
        downloadGrid.setCount((long) count);
        downloadGrid.setMsg("");
        downloadGrid.setData(list);
        downloadGrid.setCode(0);
        return downloadGrid;
    }
}
