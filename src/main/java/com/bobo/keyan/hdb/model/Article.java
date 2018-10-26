package com.bobo.keyan.hdb.model;

import java.util.Date;

public class Article {
    private Integer atcId;

    private String atcType;

    private Integer atcNum1;

    private Integer atcNum2;

    private Date atcPublishtime;

    private String atcName;

    private Integer atcAuthorid;

    private Integer atcScrutid;

    private String atcState;

    public Integer getAtcId() {
        return atcId;
    }

    public void setAtcId(Integer atcId) {
        this.atcId = atcId;
    }

    public String getAtcType() {
        return atcType;
    }

    public void setAtcType(String atcType) {
        this.atcType = atcType == null ? null : atcType.trim();
    }

    public Integer getAtcNum1() {
        return atcNum1;
    }

    public void setAtcNum1(Integer atcNum1) {
        this.atcNum1 = atcNum1;
    }

    public Integer getAtcNum2() {
        return atcNum2;
    }

    public void setAtcNum2(Integer atcNum2) {
        this.atcNum2 = atcNum2;
    }

    public Date getAtcPublishtime() {
        return atcPublishtime;
    }

    public void setAtcPublishtime(Date atcPublishtime) {
        this.atcPublishtime = atcPublishtime;
    }

    public String getAtcName() {
        return atcName;
    }

    public void setAtcName(String atcName) {
        this.atcName = atcName == null ? null : atcName.trim();
    }

    public Integer getAtcAuthorid() {
        return atcAuthorid;
    }

    public void setAtcAuthorid(Integer atcAuthorid) {
        this.atcAuthorid = atcAuthorid;
    }

    public Integer getAtcScrutid() {
        return atcScrutid;
    }

    public void setAtcScrutid(Integer atcScrutid) {
        this.atcScrutid = atcScrutid;
    }

    public String getAtcState() {
        return atcState;
    }

    public void setAtcState(String atcState) {
        this.atcState = atcState == null ? null : atcState.trim();
    }
}