package com.longchang.www.entity;

import java.util.Date;

public class Hangorder {
    private Integer hangid;

    private Integer userid;

    private Date hangorderdate;

    private String minemachinename;

    private String minemachineno;

    private Integer buyselldirection;

    private Integer price;

    public Integer getHangid() {
        return hangid;
    }

    public void setHangid(Integer hangid) {
        this.hangid = hangid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getHangorderdate() {
        return hangorderdate;
    }

    public void setHangorderdate(Date hangorderdate) {
        this.hangorderdate = hangorderdate;
    }

    public String getMinemachinename() {
        return minemachinename;
    }

    public void setMinemachinename(String minemachinename) {
        this.minemachinename = minemachinename == null ? null : minemachinename.trim();
    }

    public String getMinemachineno() {
        return minemachineno;
    }

    public void setMinemachineno(String minemachineno) {
        this.minemachineno = minemachineno == null ? null : minemachineno.trim();
    }

    public Integer getBuyselldirection() {
        return buyselldirection;
    }

    public void setBuyselldirection(Integer buyselldirection) {
        this.buyselldirection = buyselldirection;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}