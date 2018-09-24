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
public class Chats implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聊天id
     */
    @TableId(value = "chats_id", type = IdType.AUTO)
    private Integer chatsId;

    /**
     * 发送内容
     */
    private String content;

    /**
     * 聊天文件url
     */
    private String charsUrl;

    /**
     * 发送时间
     */
    private LocalDateTime time;

    /**
     * 发送消息人的Id
     */
    private Integer fromId;

    /**
     * 接受表
     */
    private Integer toId;


}
