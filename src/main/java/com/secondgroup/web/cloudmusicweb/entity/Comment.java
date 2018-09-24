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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论表id
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 评论时间
     */
    private LocalDateTime commentTime;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 评论人id
     */
    private Integer commentUser;

    /**
     * 评论自增表Id
     */
    private Integer commentCommentIncrease;

    /**
     * 回复者在本表中的id
     */
    private Integer replyId;

    /**
     * 点赞自增表Id
     */
    private Integer commentLikeIncrease;


}
