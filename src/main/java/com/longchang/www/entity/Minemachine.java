package com.longchang.www.entity;

public class Minemachine {
    private Integer mmid;

    private String minemachinename;

    private String minemachineno;

    private String markone;

    private String marktwo;

    public Integer getMmid() {
        return mmid;
    }

    public void setMmid(Integer mmid) {
        this.mmid = mmid;
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