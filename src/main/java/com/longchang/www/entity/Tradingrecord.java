package com.longchang.www.entity;

public class Tradingrecord {
    private Integer transactionid;

    private String minemachinename;

    private Integer minemachineprice;

    private String minemachineno;

    private Integer minemachineowner;

    private Integer buysellstatus;

    private Integer bargainstatus;

    public Integer getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public String getMinemachinename() {
        return minemachinename;
    }

    public void setMinemachinename(String minemachinename) {
        this.minemachinename = minemachinename == null ? null : minemachinename.trim();
    }

    public Integer getMinemachineprice() {
        return minemachineprice;
    }

    public void setMinemachineprice(Integer minemachineprice) {
        this.minemachineprice = minemachineprice;
    }

    public String getMinemachineno() {
        return minemachineno;
    }

    public void setMinemachineno(String minemachineno) {
        this.minemachineno = minemachineno == null ? null : minemachineno.trim();
    }

    public Integer getMinemachineowner() {
        return minemachineowner;
    }

    public void setMinemachineowner(Integer minemachineowner) {
        this.minemachineowner = minemachineowner;
    }

    public Integer getBuysellstatus() {
        return buysellstatus;
    }

    public void setBuysellstatus(Integer buysellstatus) {
        this.buysellstatus = buysellstatus;
    }

    public Integer getBargainstatus() {
        return bargainstatus;
    }

    public void setBargainstatus(Integer bargainstatus) {
        this.bargainstatus = bargainstatus;
    }
}