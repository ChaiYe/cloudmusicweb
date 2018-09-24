package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class DynamicPic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 动态图片编号
     */
    @TableId(value = "dynamic_pic_id", type = IdType.AUTO)
    private Integer dynamicPicId;

    /**
     * 动态图片url
     */
    private String dynamicImgUrl;

    /**
     * 动态编号
     */
    private Integer dynamicPicDynamic;


}
