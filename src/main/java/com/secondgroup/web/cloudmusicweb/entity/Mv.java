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
public class Mv implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * mv编号
     */
    @TableId(value = "mv_id", type = IdType.AUTO)
    private Integer mvId;

    /**
     * 上传时间
     */
    private LocalDateTime uploadtime;

    /**
     * 播放量
     */
    private Long playback;

    /**
     * 收藏量
     */
    private Long collection;

    /**
     * 下载量
     */
    private Long download;

    /**
     * 下载积分
     */
    private Integer integral;

    /**
     * mv图片Url
     */
    private String mvPicUrl;

    /**
     * mv唯一对应歌曲
     */
    private Integer mvSong;

    /**
     * mv类型自增表Id
     */
    private Integer mvKindIncrease;

    /**
     * 评论自增表Id
     */
    private Integer mvCommentIncrease;


}
