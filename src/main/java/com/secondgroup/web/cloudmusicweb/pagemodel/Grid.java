package com.secondgroup.web.cloudmusicweb.pagemodel;

import java.util.List;

public class Grid<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String msg;


    /**
     * 分页数据总行数
     */
    private Long count;


    /**
     * 分页查询数据
     */
    private List<T>  data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
