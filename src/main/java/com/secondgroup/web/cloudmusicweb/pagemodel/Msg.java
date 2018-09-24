package com.secondgroup.web.cloudmusicweb.pagemodel;

public class Msg {

    private String code;

    private String msg;

    public Msg() {
    }

    public Msg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
