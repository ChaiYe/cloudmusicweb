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
public class LikeIncrease implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 点赞自增表Id
     */
    @TableId(value = "like_increase_id", type = IdType.AUTO)
    private Integer likeIncreaseId;


}
