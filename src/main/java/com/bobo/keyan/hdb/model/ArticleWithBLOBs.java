package com.bobo.keyan.hdb.model;

public class ArticleWithBLOBs extends Article {
    private String atcContent;

    private String atcIntroduction;

    public String getAtcContent() {
        return atcContent;
    }

    public void setAtcContent(String atcContent) {
        this.atcContent = atcContent == null ? null : atcContent.trim();
    }

    public String getAtcIntroduction() {
        return atcIntroduction;
    }

    public void setAtcIntroduction(String atcIntroduction) {
        this.atcIntroduction = atcIntroduction == null ? null : atcIntroduction.trim();
    }
}