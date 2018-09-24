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
public class SongSinger implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 歌曲歌手对应表Id
     */
    @TableId(value = "song_singer_id", type = IdType.AUTO)
    private Integer songSingerId;

    /**
     * 歌曲Id
     */
    private Integer songSingerSong;

    /**
     * 歌手Id
     */
    private Integer songSingerSinger;


}
