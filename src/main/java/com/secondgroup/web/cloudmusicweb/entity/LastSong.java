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
public class LastSong implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 最近播放表Id
     */
    @TableId(value = "last_song_id", type = IdType.AUTO)
    private Integer lastSongId;

    /**
     * 用户Id
     */
    private Integer lastSongUser;

    /**
     * 歌曲Id
     */
    private Integer lastSongSong;

    /**
     * 播放时间
     */
    private LocalDateTime playTime;


}
