package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
public class Singer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 歌手id
     */
    @TableId(value = "sing_id", type = IdType.AUTO)
    private Integer singId;

    /**
     * 粉丝数量
     */
    private Long fansNum;

    /**
     * 自我介绍
     */
    @TableField("selfIntro")
    private String selfIntro;

    /**
     * 用户Id
     */
    private Integer singerUser;


}
