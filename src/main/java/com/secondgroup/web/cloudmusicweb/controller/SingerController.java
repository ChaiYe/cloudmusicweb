package com.secondgroup.web.cloudmusicweb.controller;


import com.secondgroup.web.cloudmusicweb.entity.Singer;
import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.service.ISingerService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/singer")
public class SingerController {

    @Autowired
    private ISingerService iSingerService;

    @RequestMapping("/singer_page")
    public Grid<Singer> getSingers(@RequestParam(value="page",defaultValue = "1")Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, User singerCondition , HttpSession session) {

        List<Singer> list=iSingerService.getPage(current,size,singerCondition);
        int count = iSingerService.count(singerCondition);

        Grid<Singer> singerGrid=new Grid<>();
        singerGrid.setCount((long) count);
        singerGrid.setMsg("");
        singerGrid.setCode(0);
        singerGrid.setData(list);

        return singerGrid;
    }

}
