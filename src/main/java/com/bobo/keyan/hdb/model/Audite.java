package com.bobo.keyan.hdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class Audite {
    private Integer aId;

    private Integer aUserid;

    private BigDecimal aAmount;

    private Integer aDateline;

    private String aInterest;

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

    public BigDecimal getaAmount() {
        return aAmount;
    }

    public void setaAmount(BigDecimal aAmount) {
        this.aAmount = aAmount;
    }

    public Integer getaDateline() {
        return aDateline;
    }

    public void setaDateline(Integer aDateline) {
        this.aDateline = aDateline;
    }

    public String getaInterest() {
        return aInterest;
    }

    public void setaInterest(String aInterest) {
        this.aInterest = aInterest == null ? null : aInterest.trim();
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