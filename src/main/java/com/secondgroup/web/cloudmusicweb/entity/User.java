package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }


    /**
     * 用户id

     */
    @Getter
    @Setter
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 昵称
     */
    @Getter @Setter
    private String name;

    /**
     * 账号
     */
    @Getter @Setter
    private String account;

    /**
     * 密码
     */
    @Getter @Setter
    private String password;

    /**
     * 性别
     */
    @Getter @Setter
    private Integer sex;

    /**
     * 生日
     */
    @Getter @Setter
    private LocalDateTime birthday;

    /**
     * 地址
     */
    @Getter @Setter
    private String address;

    /**
     * 介绍
     */
    @Getter @Setter
    private String introduce;

    /**
     * 头像
     */
    @Getter @Setter
    private String image;

    /**
     * 注册时间
     */
    @Getter @Setter
    private LocalTime registTime;

    /**
     * 状态，1表示正常，0表示不正常
     */
    @Getter @Setter
    private Integer state;

    /**
     * 用户类型
     */
    @Getter @Setter
    private Integer type;


}
