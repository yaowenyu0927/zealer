package com.zealer.entity;

import org.springframework.stereotype.Component;


public class Picture {
    private Integer pid;

    private String purl;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl == null ? null : purl.trim();
    }
}