package com.bobo.keyan.hdb.model;

import java.util.Date;

public class Stream {
    private Integer sId;

    private Integer sProjectid;

    private Integer sUserid;

    private String sType;

    private Long sAmount;

    private Date sTime;

    private Integer sInvestid;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsProjectid() {
        return sProjectid;
    }

    public void setsProjectid(Integer sProjectid) {
        this.sProjectid = sProjectid;
    }

    public Integer getsUserid() {
        return sUserid;
    }

    public void setsUserid(Integer sUserid) {
        this.sUserid = sUserid;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType == null ? null : sType.trim();
    }

    public Long getsAmount() {
        return sAmount;
    }

    public void setsAmount(Long sAmount) {
        this.sAmount = sAmount;
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public Integer getsInvestid() {
        return sInvestid;
    }

    public void setsInvestid(Integer sInvestid) {
        this.sInvestid = sInvestid;
    }
}