package com.longchang.www.entity;

import java.util.Date;

public class Pay {
    private Integer payid;

    private Date paydate;

    private Integer payorback;

    private Integer paymoneny;

    private Integer paystatus;

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Integer getPayorback() {
        return payorback;
    }

    public void setPayorback(Integer payorback) {
        this.payorback = payorback;
    }

    public Integer getPaymoneny() {
        return paymoneny;
    }

    public void setPaymoneny(Integer paymoneny) {
        this.paymoneny = paymoneny;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }
}