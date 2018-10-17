package com.secondgroup.web.cloudmusicweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.secondgroup.web.cloudmusicweb.entity.Mv;
import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.secondgroup.web.cloudmusicweb.entity.extend.MvExtend;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.service.IMvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/mv")
public class MvController {

    @Autowired
    private IMvService mvService;

    @RequestMapping("/mv_page")
    public Grid<Mv> getMv(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, MvExtend mvCondition, HttpSession session) {
        QueryWrapper<Mv> mvQueryWrapper = new QueryWrapper<>();

        List<Mv> mvList=mvService.getPage(current,size,mvCondition);
        int count = mvService.count(mvCondition);

        Grid<Mv> mvGrid = new Grid<>();
        mvGrid.setCode(0);
        mvGrid.setMsg("");
        mvGrid.setData(mvList);
        mvGrid.setCount((long) count);
        return mvGrid;
    }

    @RequestMapping("/del_mv")
    public Boolean delMv(Integer id){
        boolean b=mvService.removeById(id);
        return b;
    }

    @RequestMapping("/del_mvs")
    public Boolean delMvs(@RequestBody List<Mv> mvs){
        for(Mv mv:mvs){
            delMv(mv.getMvId());
        }
        return true;
    }

    @RequestMapping("/update_mv")
    public Boolean updateMv(Mv mv){
        boolean b = mvService.updateById(mv);
        return b;
    }

}
