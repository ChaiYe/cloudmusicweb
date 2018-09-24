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
public class Kind implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "kind_id", type = IdType.AUTO)
    private Integer kindId;

    /**
     * 类型自增表Id
     */
    private Integer kindKindIncrease;

    /**
     * 基本类型表Id
     */
    private Integer kindBaseKind;


}
