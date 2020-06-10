package com.zealer.entity;

public class Product {
    private Integer id;

    private String pname;

    private Double pprice;

    private Integer pinventory;

    private String picon;

    private String plocation;

    private Integer pviews;

    private String pstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public Integer getPinventory() {
        return pinventory;
    }

    public void setPinventory(Integer pinventory) {
        this.pinventory = pinventory;
    }

    public String getPicon() {
        return picon;
    }

    public void setPicon(String picon) {
        this.picon = picon == null ? null : picon.trim();
    }

    public String getPlocation() {
        return plocation;
    }

    public void setPlocation(String plocation) {
        this.plocation = plocation == null ? null : plocation.trim();
    }

    public Integer getPviews() {
        return pviews;
    }

    public void setPviews(Integer pviews) {
        this.pviews = pviews;
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate == null ? null : pstate.trim();
    }
}