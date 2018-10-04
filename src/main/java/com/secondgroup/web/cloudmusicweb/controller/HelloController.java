package com.secondgroup.web.cloudmusicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "bg/management/BGManagement";
    }

    @RequestMapping("/mytable")
    public String myTable() {
        return "test/mytable";
    }


    /**
     * 角色信息表
     *
     * @return
     */
    @RequestMapping("/rolestable")
    public String roleTable() {
        return "bg/table/role_table";
    }

    /**
     * 专辑信息表
     *
     * @return
     */
    @RequestMapping("/albumtable")
    public String albumTable() {
        return "bg/table/albumtable";
    }


    /**
     * 购歌记录信息表
     *
     * @return
     */
    @RequestMapping("/buySongtable")
    public String buySongTable() {
        return "bg/table/buySongtable";
    }

    /**
     * 关注信息表
     *
     * @return
     */
    @RequestMapping("/focustable")
    public String focusTable() {
        return "bg/table/focustable";
    }

    /**
     * mv信息表
     *
     * @return
     */
    @RequestMapping("/mvtable")
    public String mvTable() {
        return "bg/table/mvtable";
    }

    /**
     * 权限信息表
     *
     * @return
     */
    @RequestMapping("/permissiontable")
    public String permissionTable() {
        return "bg/table/permissiontable";
    }

    /**
     * 歌手信息表
     *
     * @return
     */
    @RequestMapping("/singertable")
    public String singerTable() {
        return "bg/table/singertable";
    }

    /**
     * 歌曲信息表
     *
     * @return
     */
    @RequestMapping("/songtable")
    public String songTable() {
        return "bg/table/songtable";
    }

    /**
     * 用户信息表
     *
     * @return
     */
    @RequestMapping("/usertable")
    public String userTable() {
        return "bg/table/usertable";
    }


    /**
     * 添加角色页面
     *
     * @return
     */
    @RequestMapping("/addrole")
    public String addrole() {
        return "bg/add/add_role";
    }

    /**
     * 登录页面
     *
     * @return
     */
    @GetMapping(value = "/login")
    public String getlogin() {
        return "bg/login";
    }

    /**
     * 添加用户页面
     *
     * @return
     */
    @GetMapping(value = "/adduser")
    public String addUserPage() {
        return "bg/add/add_user";
    }

    /**
     * 添加MV页面
     *
     * @return
     */
    @GetMapping(value = "/addmv")
    public String addMv() {
        return "bg/add/addMV";
    }


    /**
     * 添加歌曲页面
     *
     * @return
     */
    @GetMapping(value = "/addsong")
    public String addSong() {
        return "bg/add/addSong";
    }

    /**
     * 添加歌手页面
     *
     * @return
     */
    @GetMapping(value = "/addsinger")
    public String addSinger() {
        return "bg/add/addSinger";
    }

    /**
     * 添加积分页面？？？
     *
     * @return
     */
    @GetMapping(value = "/addintegral")
    public String addintegral() {
        return "bg/add/addIntegral";
    }

    /**
     * 添加权限页面
     *
     * @return
     */
    @GetMapping(value = "/addpermission")
    public String addPermission() {
        return "bg/add/addPermission";
    }

    /**
     * 添加专辑页面
     * @return
     */
    @GetMapping("/addalbum")
    public String addAlbum(){
        return "bg/add/addalbum";
    }

    /**
     *使用excel上传歌曲页面
     *  @return
     */
    @GetMapping("/addSongExcel")
    public String addSongExcel() {
        return "bg/add/addSongExcel";
    }

}
