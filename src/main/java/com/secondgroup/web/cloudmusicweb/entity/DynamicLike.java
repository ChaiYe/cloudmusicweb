package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DynamicLike {

    /**
     * 动态点赞Id
     */
    @TableId(value = "dynamic_like_id", type = IdType.AUTO)
    private Integer dynamicLikeId;

    /**
     * 动态id
     */
    private Integer dynamicLikeDynamic;

    /**
     * 点赞者
     */
    private Integer dynamicLikeUser;

}
