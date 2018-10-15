package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.secondgroup.web.cloudmusicweb.entity.Album;
import com.secondgroup.web.cloudmusicweb.entity.Kind;
import com.secondgroup.web.cloudmusicweb.entity.KindIncrease;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

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
public class SongExtend implements Serializable {

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
     * 歌曲专辑
     */
    private Album album;


    /**
     * 歌曲自增ID
     */
    private KindIncrease kindIncrease;


    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
    }

    public Long getPlayback() {
        return playback;
    }

    public void setPlayback(Long playback) {
        this.playback = playback;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


}
