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
public class Song implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 歌曲id
     */
    @TableId(value = "song_id", type = IdType.AUTO)
    private Integer songId;

    /**
     * 歌名
     */
    private String name;

    /**
     * 用户头像
     */
    private String picUrl;

    /**
     * 歌曲是否上架（0-false,1-true）
     */
    private Integer isActive;

    /**
     * 歌曲是否vip（0-false,1-true）
     */
    private Integer isVip;

    /**
     * 歌曲数据大小
     */
    private String size;

    /**
     * 歌词文件
     */
    private String lyric;

    /**
     * 歌曲存储url
     */
    private String storageUrl;

    /**
     * 播放量
     */
    private Long playback;

    /**
     * 收藏量
     */
    private Long collection;

    /**
     * 上传时间
     */
    private LocalDateTime uploadTime;

    /**
     * 简介信息
     */
    private String note;

    /**
     * 歌曲时长
     */
    private String durationTime;

    /**
     * 歌曲下载所需积分
     */
    private Integer integral;

    /**
     * 专辑id
     */
    private Integer songAlbum;

    /**
     * 类型自增表Id
     */
    private Integer songKindIncrease;

    private Integer songCommentIncrease;


}
