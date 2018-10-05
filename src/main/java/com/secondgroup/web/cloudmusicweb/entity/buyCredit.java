package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class buyCredit {

    /**
     * 表Id
     */
    @TableId(value = "buy_credit_id", type = IdType.AUTO)
    private Integer buyCreditId;


    /**
     * 购买者ID
     */
    private Integer buyCreditUser;

    /**
     * 积分数量
     */
    private Integer num;


    /**
     * 购买时间
     */
    private LocalDateTime buyTime;

}
