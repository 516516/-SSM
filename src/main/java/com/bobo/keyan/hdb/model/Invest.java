package com.bobo.keyan.hdb.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Invest implements Serializable{
    private Integer iId;

    private Integer iUserid;

    private Integer iProjectid;

    private Date iDatetime;

    private BigDecimal iAmount;

    private String iState;

    private String iInterest;

    private String iMessage;

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

    public BigDecimal getiAmount() {
        return iAmount;
    }

    public void setiAmount(BigDecimal iAmount) {
        this.iAmount = iAmount;
    }

    public String getiState() {
        return iState;
    }
    
    public void setiState(String iState) {
        this.iState = iState == null ? null : iState.trim();
    }
    
    public String getiInterest() {
        return iInterest;
    }
    
    public void setiInterest(String iInterest) {
        this.iInterest = iInterest == null ? null : iInterest.trim();
    }

    public String getiMessage() {
        return iMessage;
    }

    public void setiMessage(String iMessage) {
        this.iMessage = iMessage == null ? null : iMessage.trim();
    }
}