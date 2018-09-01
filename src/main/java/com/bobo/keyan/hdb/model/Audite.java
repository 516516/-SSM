package com.bobo.keyan.hdb.model;

import java.util.Date;

public class Audite {
    private Integer aId;

    private Integer aUserid;

    private Long aAmount;

    private Date aDateline;

    private Long aInterest;

    private Date aApplytime;

    private String aState;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaUserid() {
        return aUserid;
    }

    public void setaUserid(Integer aUserid) {
        this.aUserid = aUserid;
    }

    public Long getaAmount() {
        return aAmount;
    }

    public void setaAmount(Long aAmount) {
        this.aAmount = aAmount;
    }

    public Date getaDateline() {
        return aDateline;
    }

    public void setaDateline(Date aDateline) {
        this.aDateline = aDateline;
    }

    public Long getaInterest() {
        return aInterest;
    }

    public void setaInterest(Long aInterest) {
        this.aInterest = aInterest;
    }

    public Date getaApplytime() {
        return aApplytime;
    }

    public void setaApplytime(Date aApplytime) {
        this.aApplytime = aApplytime;
    }

    public String getaState() {
        return aState;
    }

    public void setaState(String aState) {
        this.aState = aState == null ? null : aState.trim();
    }
}