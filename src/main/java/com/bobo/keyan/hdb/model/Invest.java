package com.bobo.keyan.hdb.model;

import java.util.Date;

public class Invest {
    private Integer iId;

    private Integer iUserid;

    private Integer iProjectid;

    private Date iDatetime;

    private Long iAmount;

    private String iState;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getiUserid() {
        return iUserid;
    }

    public void setiUserid(Integer iUserid) {
        this.iUserid = iUserid;
    }

    public Integer getiProjectid() {
        return iProjectid;
    }

    public void setiProjectid(Integer iProjectid) {
        this.iProjectid = iProjectid;
    }

    public Date getiDatetime() {
        return iDatetime;
    }

    public void setiDatetime(Date iDatetime) {
        this.iDatetime = iDatetime;
    }

    public Long getiAmount() {
        return iAmount;
    }

    public void setiAmount(Long iAmount) {
        this.iAmount = iAmount;
    }

    public String getiState() {
        return iState;
    }

    public void setiState(String iState) {
        this.iState = iState == null ? null : iState.trim();
    }
}