package com.longchang.www.entity;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private Integer phoneno;

    private String email;

    private String identityno;

    private Integer accountbalance;

    private Integer havemachineno;

    private String markone;

    private String marktwo;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Integer phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdentityno() {
        return identityno;
    }

    public void setIdentityno(String identityno) {
        this.identityno = identityno == null ? null : identityno.trim();
    }

    public Integer getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(Integer accountbalance) {
        this.accountbalance = accountbalance;
    }

    public Integer getHavemachineno() {
        return havemachineno;
    }

    public void setHavemachineno(Integer havemachineno) {
        this.havemachineno = havemachineno;
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