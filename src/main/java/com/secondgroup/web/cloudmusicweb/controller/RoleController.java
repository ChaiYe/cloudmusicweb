package com.secondgroup.web.cloudmusicweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.secondgroup.web.cloudmusicweb.pagemodel.Msg;
import com.secondgroup.web.cloudmusicweb.service.IRoleService;
import com.secondgroup.web.cloudmusicweb.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    /**
     * 分页查询角色
     * 格式要求：LayUI传进的传来的参数是page和limit
     * @param current 当前页
     * @param size 每一页的大小
     * @return
     * @throws Exception
     */
    @RequestMapping("/roles_page")
    public Grid<Role> getRoles(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, @RequestParam(value = "condition" ,defaultValue = "") String condition, HttpSession session) throws Exception {

        QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<>();

        if (!condition.isEmpty()) {
            /*此次设计不合理*/
            /*用于判断上一次传入的条件与新传入的条件是否一致，如果不一致将当前页面数设为1*/
            if(session.getAttribute("beforeCondiction")==null){
                session.setAttribute("beforeCondiction",condition);
            }else{
                if(!session.getAttribute("beforeCondiction").equals(condition)){
                    current=1;
                    session.setAttribute("beforeCondiction",condition);
                }
            }
            roleQueryWrapper.eq("role_name",condition);
        }

        IPage<Role> roleIPage = iRoleService.page(new Page<Role>(current, size), roleQueryWrapper);

        Grid<Role> roleGrid = new Grid<>();
        roleGrid.setCode(0);
        roleGrid.setCount(roleIPage.getTotal());
        roleGrid.setMsg("");
        roleGrid.setData(roleIPage.getRecords());

        return roleGrid;
    }

    /**
     * 根据权限ID删除权限
     * @param id 权限id
     * @return 消息
     * @throws Exception
     */
    @RequestMapping("/del_role")
    public Msg delRoleById(Integer id)throws Exception{
        boolean delResult = iRoleService.removeById(id);
        return delResult==true?new Msg("删除成功"):new Msg("删除失败");
    }


    @RequestMapping("/del_roles")
    public Msg delRoles(@RequestBody List<Role> roles) throws  Exception{

        Integer delrolesresult = iRoleService.delRoles(roles);

        return delrolesresult==1?new Msg("删除成功"):new Msg("删除失败");
    }

    /**
     * 添加角色
     * @param role 角色
     * @return 消息
     * @throws Exception
     */
    @PostMapping("/add_role")
    public Msg addRole(Role role) throws  Exception{
        boolean saveResult = iRoleService.save(role);
        return saveResult==true?new Msg("添加成功"):new Msg("添加失败");
    }

    /**
     * 根据角色Id更新角色
     * @param role 更新角色
     * @return 消息
     * @throws Exception
     */
    @PostMapping("/update_role")
    public Msg updateRole(Role role) throws  Exception{
        boolean updateResult = iRoleService.updateById(role);
        return updateResult==true?new Msg("更新成功"):new Msg("更新失败");
    }




}
