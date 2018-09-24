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
public class CommentIncrease implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论自增表Id
     */
    @TableId(value = "comment_increase_id", type = IdType.AUTO)
    private Integer commentIncreaseId;


}
