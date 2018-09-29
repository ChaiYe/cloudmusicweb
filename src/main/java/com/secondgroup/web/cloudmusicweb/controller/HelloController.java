package com.secondgroup.web.cloudmusicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "bg/management/BGManagement";
    }

    @RequestMapping("/mytable")
    public String  myTable(){
        return "test/mytable";
    }


    @RequestMapping("/rolestable")
    public String roleTable(){
        return "bg/table/role_table";
    }

    @RequestMapping("/albumtable")
    public String albumTable(){
        return "bg/table/albumtable";
    }


    @RequestMapping("/buySongtable")
    public String buySongTable(){
        return "bg/table/buySongtable";
    }

    @RequestMapping("/focustable")
    public String focusTable(){
        return "bg/table/focustable";
    }

    @RequestMapping("/mvtable")
    public String mvTable(){
        return "bg/table/mvtable";
    }

    @RequestMapping("/permissiontable")
    public String permissionTable(){
        return "bg/table/permissiontable";
    }

    @RequestMapping("/singertable")
    public String singerTable(){
        return "bg/table/singertable";
    }

    @RequestMapping("/songtable")
    public String songTable(){
        return "bg/table/songtable";
    }

    @RequestMapping("/usertable")
    public String userTable(){
        return "bg/table/usertable";
    }



    @RequestMapping("/addrole")
    public String addrole(){
        return "bg/add/add_role";
    }

    @GetMapping(value = "/login")
    public String getlogin(){
        return "bg/login.html";
    }

    @GetMapping(value="/adduser")
    public String addUserPage(){
        return "bg/add/add_user.html";
    }
}
