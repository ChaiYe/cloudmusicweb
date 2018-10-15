package com.secondgroup.web.cloudmusicweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.secondgroup.web.cloudmusicweb.entity.Album;
import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private IAlbumService iAlbumService;

    @RequestMapping("/album_page")
    public Grid<Album> getAlbum(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, @RequestParam(value = "condition" ,defaultValue = "") String condition, HttpSession session){
        QueryWrapper<Album> albumQueryWrapper = new QueryWrapper<>();

        IPage<Album> albumIPage=iAlbumService.page(new Page<Album>(current, size),albumQueryWrapper);

        Grid<Album> albumGrid = new Grid<>();
        albumGrid.setCode(0);
        albumGrid.setMsg("");
        albumGrid.setData(albumIPage.getRecords());
        albumGrid.setCount((long) iAlbumService.count(albumQueryWrapper));

        return albumGrid;
    }
}
