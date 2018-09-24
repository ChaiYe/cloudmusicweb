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
public class Download implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 下载id
     */
    @TableId(value = "download_id", type = IdType.AUTO)
    private Integer downloadId;

    /**
     * 用户id
     */
    private Integer downloadUser;

    /**
     * 歌曲id
     */
    private Integer downloadSong;

    /**
     * 下载日期
     */
    private LocalDateTime downloadTime;


}
