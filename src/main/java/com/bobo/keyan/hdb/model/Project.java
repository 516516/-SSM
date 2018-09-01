package com.bobo.keyan.hdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private Integer pId;

    private String pName;

    private String pType;

    private BigDecimal pAmount;

    private BigDecimal pInvestAmount;

    private String pIntroduction;

    private Date pDateInvestfirst;

    private String pState;

    private Date pDateInvestend;

    private Date pDateline;

    private Integer pBorrowerId;

    private String pRate;

    private Integer pAuditorId;

    private Integer pCreatorId;

    private String pExamineContent;

    private String pContent;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public BigDecimal getpAmount() {
        return pAmount;
    }

    public void setpAmount(BigDecimal pAmount) {
        this.pAmount = pAmount;
    }

    public BigDecimal getpInvestAmount() {
        return pInvestAmount;
    }

    public void setpInvestAmount(BigDecimal pInvestAmount) {
        this.pInvestAmount = pInvestAmount;
    }

    public String getpIntroduction() {
        return pIntroduction;
    }

    public void setpIntroduction(String pIntroduction) {
        this.pIntroduction = pIntroduction == null ? null : pIntroduction.trim();
    }

    public Date getpDateInvestfirst() {
        return pDateInvestfirst;
    }

    public void setpDateInvestfirst(Date pDateInvestfirst) {
        this.pDateInvestfirst = pDateInvestfirst;
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState == null ? null : pState.trim();
    }

    public Date getpDateInvestend() {
        return pDateInvestend;
    }

    public void setpDateInvestend(Date pDateInvestend) {
        this.pDateInvestend = pDateInvestend;
    }

    public Date getpDateline() {
        return pDateline;
    }

    public void setpDateline(Date pDateline) {
        this.pDateline = pDateline;
    }

    public Integer getpBorrowerId() {
        return pBorrowerId;
    }

    public void setpBorrowerId(Integer pBorrowerId) {
        this.pBorrowerId = pBorrowerId;
    }

    public String getpRate() {
        return pRate;
    }

    public void setpRate(String pRate) {
        this.pRate = pRate == null ? null : pRate.trim();
    }

    public Integer getpAuditorId() {
        return pAuditorId;
    }

    public void setpAuditorId(Integer pAuditorId) {
        this.pAuditorId = pAuditorId;
    }

    public Integer getpCreatorId() {
        return pCreatorId;
    }

    public void setpCreatorId(Integer pCreatorId) {
        this.pCreatorId = pCreatorId;
    }

    public String getpExamineContent() {
        return pExamineContent;
    }

    public void setpExamineContent(String pExamineContent) {
        this.pExamineContent = pExamineContent == null ? null : pExamineContent.trim();
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent == null ? null : pContent.trim();
    }
}