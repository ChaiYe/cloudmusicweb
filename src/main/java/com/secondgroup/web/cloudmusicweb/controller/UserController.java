package com.secondgroup.web.cloudmusicweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.pagemodel.Msg;
import com.secondgroup.web.cloudmusicweb.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    DefaultKaptcha defaultKaptcha;
    @Autowired
    private   IUserService iUserService;
    @Autowired
    JavaMailSenderImpl javaMailSender;

    /**
     * 登录密码校验
     * @param userName
     * @param password
     */
    @ResponseBody
    @PostMapping("/login")
    public Msg loginvalidate(String userName, String password){
        Msg msg = new Msg();
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password );
        try{
            subject.login(token);
        }catch (Exception e){
            msg.setMsg("500");
            msg.setMsg("密码或用户名错误");
            return msg;
        }

        msg.setCode("200");
        msg.setMsg("密码无误");
        return msg;

    }


    /**
     * 生成验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }


    /**
     *校验验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/imgvrifyControllerDefaultKaptcha")
    public Msg imgvrifyControllerDefaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,String code){
        Msg msg = new Msg();
        String parameter = (String) httpServletRequest.getSession().getAttribute("vrifyCode");

        if (!code.equals(parameter)) {
            msg.setCode("500");
            msg.setMsg("登录失败");
        } else {
            msg.setCode("200");
            msg.setMsg("登录成功");
        }
        return msg;
    }


    /**
     * 查找昵称是否已存在
     * @param account 昵称
     * @return  昵称已存在则返回msg500，否则返回msg200
     * @throws Exception
     */
    @PostMapping("/findAccount")
    public Msg findAccount(String account){
        Msg msg = new Msg();

        try {
            QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
            userQueryWrapper.eq("account",account);
            Integer count = iUserService.count(userQueryWrapper);
            if (count== 0) {
                msg.setCode("200");
            }else {
                msg.setCode("500");
                msg.setMsg("该昵称已经存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  msg;
    }

    /**
     * 用户注册
     * @param user
     * @return
     * @throws Exception
     */
    @PostMapping("/registered")
    public Msg registered(User user) throws  Exception{
        Msg msg = new Msg();

        MimeMessage mimeMessage=javaMailSender.createMimeMessage();
        MimeMessageHelper helper= new MimeMessageHelper(mimeMessage,true);

        helper.setSubject("CloudMusic激活");
        helper.setText("<div style='color:red;'>激活码："+"123"+"<div>",true);
        helper.setTo(user.getEmail());
        helper.setFrom("3156056300@qq.com");

        helper.addAttachment("1.jpg",new File("D:\\壁纸\\wallhaven-363984.jpg"));

        javaMailSender.send(mimeMessage);

        user.setType(1);

        boolean save = iUserService.save(user);

        return  msg;
    }

    @RequestMapping("del_user")
    public Msg delUserById(Integer id){
        boolean delResult = iUserService.removeById(id);
        return delResult == true ? new Msg("删除成功") : new Msg("删除失败");
    }

    @RequestMapping("del_users")
    public Msg delUsers(@RequestBody List<User> users){
        return null;
    }

    @RequestMapping("user_page")
    public Grid<User> getUsers(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, User userCondition, HttpSession session){
        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();

        List<User> userList=iUserService.getPage(current,size,userCondition);

        Grid<User> userGrid=new Grid<>();
        userGrid.setCode(0);
        userGrid.setMsg("");
        userGrid.setCount((long) iUserService.count(userQueryWrapper));
        userGrid.setData(userList);

        return userGrid;
    }



}
