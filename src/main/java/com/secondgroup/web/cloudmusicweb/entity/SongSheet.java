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
public class SongSheet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 歌单id
     */
    @TableId(value = "song_sheet_id", type = IdType.AUTO)
    private Integer songSheetId;

    /**
     * 歌单名称
     */
    private String sheetName;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 是否私有（0-false,1-ture）
     */
    private Integer isPrivate;

    /**
     * 播放量
     */
    private Long playback;

    /**
     * 歌单描述
     */
    private String note;

    /**
     * 分享量
     */
    private Long share;

    /**
     * 收藏量
     */
    private Long collection;

    /**
     * 图片本地地址
     */
    private String picUrl;

    /**
     * 所属用户id
     */
    private Integer songSheetUser;

    /**
     * 歌单标签关联表id
     */
    private Integer songSheetKingIncrease;

    /**
     * 评论自增表Id
     */
    private Integer songSheetCommentIncrease;


}
