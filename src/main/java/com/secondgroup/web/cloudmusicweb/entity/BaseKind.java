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
public class BaseKind implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 基本类型表Id
     */
    @TableId(value = "base_kind_id", type = IdType.AUTO)
    private Integer baseKindId;

    /**
     * 类型名
     */
    private String name;

    /**
     * 该类型属于五大分类中的哪一类
     */
    private String category;


}
