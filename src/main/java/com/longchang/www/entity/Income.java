package com.longchang.www.entity;

public class Income {
    private Integer incomeid;

    private String minemachinename;

    private String incomedate;

    private Integer income;

    private String markone;

    private String marktwo;

    public Integer getIncomeid() {
        return incomeid;
    }

    public void setIncomeid(Integer incomeid) {
        this.incomeid = incomeid;
    }

    public String getMinemachinename() {
        return minemachinename;
    }

    public void setMinemachinename(String minemachinename) {
        this.minemachinename = minemachinename == null ? null : minemachinename.trim();
    }

    public String getIncomedate() {
        return incomedate;
    }

    public void setIncomedate(String incomedate) {
        this.incomedate = incomedate == null ? null : incomedate.trim();
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getMarkone() {
        return markone;
    }

    public void setMarkone(String markone) {
        this.markone = markone == null ? null : markone.trim();
    }

    public String getMarktwo() {
        return marktwo;
    }

    public void setMarktwo(String marktwo) {
        this.marktwo = marktwo == null ? null : marktwo.trim();
    }
}