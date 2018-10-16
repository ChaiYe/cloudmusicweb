package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.secondgroup.web.cloudmusicweb.entity.Singer;
import com.secondgroup.web.cloudmusicweb.entity.User;

public class SingerExtend extends Singer {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
