package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Price {

    /**
     * 价格Id
     */
    @TableId(value = "price_id", type = IdType.AUTO)
    private Integer priceId;

    /**
     * 每积分价格
     */
    private Double  intergralprice;

    /**
     *
     */
    private Double vipPrice;


}
