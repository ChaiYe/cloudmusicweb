package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.secondgroup.web.cloudmusicweb.entity.Mv;
import com.secondgroup.web.cloudmusicweb.entity.Song;

public class MvExtend extends Mv {

    private Song song;

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
