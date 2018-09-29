package com.secondgroup.web.cloudmusicweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专辑id,@TableId指定主键策略IdType.AUTO为自增
     */
    @TableId(value = "album_id", type = IdType.AUTO)
    private Integer albumId;

    /**
     * 专辑名字
     */
    private String name;

    /**
     * 发行时间
     */
    private LocalDateTime time;

    /**
     * 收藏量
     */
    private Long collectNum;

    /**
     * 专辑描述
     */
    private String introduction;

    /**
     * 专辑封面
     */
    private String image;

    /**
     * 歌手id
     */
    private Integer albumSinger;

    /**
     * 评论自增表Id
     */
    private Integer albumCommentIncrease;


}
