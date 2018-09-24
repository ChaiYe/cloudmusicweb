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
public class SongInSheet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 歌曲歌单关联id
     */
    @TableId(value = "song_in_sheet_id", type = IdType.AUTO)
    private Integer songInSheetId;

    /**
     * 歌单id
     */
    private Integer songInSheetSongSheet;

    /**
     * 歌曲id
     */
    private Integer songInSheetSong;


}
