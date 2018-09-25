package com.secondgroup.web.cloudmusicweb.controller;

import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "test/BGManagement";
    }

    @RequestMapping("/mytable")
    public String  myTable(){
        return "test/mytable";
    }


    @RequestMapping("/rolestable")
    public String roleTable(){
        return "bg/table/role_table";
    }

    @RequestMapping("/addrole")
    public String addrole(){
        return "bg/add/add_role";
    }

    @GetMapping(value = "/login")
    public String getlogin(){
        return "bg/login.html";
    }
}
