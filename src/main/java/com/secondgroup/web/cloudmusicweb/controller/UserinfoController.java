package com.secondgroup.web.cloudmusicweb.controller;


import com.secondgroup.web.cloudmusicweb.entity.Userinfo;
import com.secondgroup.web.cloudmusicweb.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/userinfo")
public class UserinfoController {

    @Autowired
    IUserinfoService userinfoService;

    @GetMapping("/getAllUser")
    public List<Userinfo> getAllUser(){
        List<Userinfo> userinfos = userinfoService.users();
        return userinfos;
    }
}
