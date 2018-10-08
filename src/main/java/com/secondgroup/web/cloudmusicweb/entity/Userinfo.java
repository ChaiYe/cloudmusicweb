package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 用户信息id

     */
    @Getter @Setter
    @TableId(value = "userinfo_id", type = IdType.AUTO)
    private Integer userinfoId;

    /**
     * 总积分
     */
    @Getter @Setter
    private Integer totalIntegral;

    /**
     * 是否vip（0-false,1-true）
     */
    @Getter @Setter
    private Integer isVip;

    /**
     * 用户id
     */
    /*private Integer userinfoUser;*/

    /**
     * 用户
     */
    @Getter @Setter
    private User user;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getTotalIntegral() {
        return totalIntegral;
    }

    public void setTotalIntegral(Integer totalIntegral) {
        this.totalIntegral = totalIntegral;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
