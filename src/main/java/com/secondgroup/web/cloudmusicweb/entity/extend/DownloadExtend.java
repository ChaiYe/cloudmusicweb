package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.secondgroup.web.cloudmusicweb.entity.Download;
import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.secondgroup.web.cloudmusicweb.entity.User;

public class DownloadExtend extends Download {

    private Song song;

    private User user;

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
