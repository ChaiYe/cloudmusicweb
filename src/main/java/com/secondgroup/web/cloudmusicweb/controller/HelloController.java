package com.secondgroup.web.cloudmusicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(){
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

}
