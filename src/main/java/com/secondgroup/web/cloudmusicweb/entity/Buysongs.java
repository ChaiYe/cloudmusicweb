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
public class Buysongs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 买歌表id
     */
    @TableId(value = "buy_songs_id", type = IdType.AUTO)
    private Integer buySongsId;

    /**
     * 购买时间
     */
    private LocalDateTime time;

    /**
     * 购买人id
     */
    private Integer buySongsUser;

    /**
     * 购买的歌曲id
     */
    private Integer buySong;


}
