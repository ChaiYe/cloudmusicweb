package com.secondgroup.web.cloudmusicweb.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.secondgroup.web.cloudmusicweb.entity.Focus;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.pagemodel.Msg;
import com.secondgroup.web.cloudmusicweb.service.IFocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/focus")
public class FocusController {

    @Autowired
    private IFocusService iFocusService;

    @RequestMapping("/focus_page")
    public Grid<Focus> getFocus(@RequestParam(value="page",defaultValue = "1")Integer current, @RequestParam(value = "limit",defaultValue = "10")Integer size, @RequestParam(value = "condition",defaultValue = "")String condition )throws Exception{

        QueryWrapper<Focus> focusQueryWrapper = new QueryWrapper<>();

        JSONArray conditionArray = JSON.parseArray(condition);

        // focusQueryWrapper.eq("focus_from_user",condition);

        //IPage<Focus> focusIPage = iFocusService.page(new Page<Focus>(current, size), focusQueryWrapper);

        int total=iFocusService.count(focusQueryWrapper);

        List<Focus> focusMsg=iFocusService.pageWithName(current,size,conditionArray);

        Grid<Focus> focusGrid = new Grid<>();
        focusGrid.setCode(0);
        focusGrid.setCount((long) total);
        focusGrid.setMsg("");
        focusGrid.setData(focusMsg);
        return focusGrid;

    }
}
