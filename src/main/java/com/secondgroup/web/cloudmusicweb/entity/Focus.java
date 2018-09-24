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
public class Focus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关注表id
     */
    @TableId(value = "focus_id", type = IdType.AUTO)
    private Integer focusId;

    /**
     * 关注人id
     */
    private Integer focusFromUser;

    /**
     * 被关注人id
     */
    private Integer focusToUser;


}
