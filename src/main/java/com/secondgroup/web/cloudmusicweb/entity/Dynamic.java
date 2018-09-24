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
public class Dynamic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 动态id
     */
    @TableId(value = "dynamic_id", type = IdType.AUTO)
    private Integer dynamicId;

    /**
     * 动态发布时间
     */
    private LocalDateTime time;

    /**
     * 动态内容
     */
    private String content;

    /**
     * 动态点赞人数
     */
    private Long likeNum;

    /**
     * 关联用户id
     */
    private Integer dynamicUser;

    /**
     * 动态中的歌曲Id
     */
    private Integer dynamicSong;

    /**
     * 评论自增表Id
     */
    private Integer dynamicCommentIncrease;


}
