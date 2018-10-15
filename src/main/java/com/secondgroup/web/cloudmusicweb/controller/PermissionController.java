package com.secondgroup.web.cloudmusicweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.secondgroup.web.cloudmusicweb.entity.Permission;
import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.pagemodel.Msg;
import com.secondgroup.web.cloudmusicweb.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private IPermissionService iPermissionService;


    /**
     * 删除权限
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/del_permission")
    public Msg delPermissionById(Integer id) throws Exception {

        boolean delResult = iPermissionService.removeById(id);
        return delResult == true ? new Msg("删除成功") : new Msg("删除失败");

    }


    /**
     * 添加权限
     * @param permission
     * @return
     * @throws Exception
     */
    @PostMapping("/add_permission")
    public Msg addPermission(Permission permission) throws Exception {

        boolean saveResult = iPermissionService.save(permission);
        return saveResult == true ? new Msg("添加成功") : new Msg("添加失败");

    }

    /**
     *更新权限
     *  @param permission
     * @return
     * @throws Exception
     */
    @PostMapping("/update_permission")
    public Msg updatePermission(Permission permission) throws  Exception {
        boolean updateResult = iPermissionService.updateById(permission);
        return updateResult==true?new Msg("更新成功"):new Msg("更新失败");
    }

    @RequestMapping("/permission_page")
    public Grid<Permission> getPermission(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size,  HttpSession session){
        QueryWrapper<Permission> queryWrapper=new QueryWrapper<>();
        IPage<Permission> page = iPermissionService.page(new Page<Permission>(current, size), queryWrapper);
        Grid<Permission> permissionGrid = new Grid<>();
        permissionGrid.setCount((long) iPermissionService.count(queryWrapper));
        permissionGrid.setMsg("");
        permissionGrid.setData(page.getRecords());
        permissionGrid.setCode(0);
        return permissionGrid;
    }

}
