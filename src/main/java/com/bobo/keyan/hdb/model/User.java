package com.bobo.keyan.hdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer uId;

    private String uName;

    private String uLoginpassword;

    private String uNickname;

    private String uPhone;

    private Date uLastlogintime;

    private Date uRegistime;

    private String uState;

    private BigDecimal uBalance;

    private BigDecimal uPrincipal;

    private BigDecimal uInterest;

    private String uAddress;

    private String uIdcard;

    private String uPaypassword;

    private Integer uCreditworth;

    private String uRealname;

    private String uSex;

    private String uRealaddress;

    private String uEmail;

    private Integer isActive;

    private String activationCode;

    private String activationCodeTime;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuLoginpassword() {
        return uLoginpassword;
    }

    public void setuLoginpassword(String uLoginpassword) {
        this.uLoginpassword = uLoginpassword == null ? null : uLoginpassword.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public Date getuLastlogintime() {
        return uLastlogintime;
    }

    public void setuLastlogintime(Date uLastlogintime) {
        this.uLastlogintime = uLastlogintime;
    }

    public Date getuRegistime() {
        return uRegistime;
    }

    public void setuRegistime(Date uRegistime) {
        this.uRegistime = uRegistime;
    }

    public String getuState() {
        return uState;
    }

    public void setuState(String uState) {
        this.uState = uState == null ? null : uState.trim();
    }

    public BigDecimal getuBalance() {
        return uBalance;
    }

    public void setuBalance(BigDecimal uBalance) {
        this.uBalance = uBalance;
    }

    public BigDecimal getuPrincipal() {
        return uPrincipal;
    }

    public void setuPrincipal(BigDecimal uPrincipal) {
        this.uPrincipal = uPrincipal;
    }

    public BigDecimal getuInterest() {
        return uInterest;
    }

    public void setuInterest(BigDecimal uInterest) {
        this.uInterest = uInterest;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard == null ? null : uIdcard.trim();
    }

    public String getuPaypassword() {
        return uPaypassword;
    }

    public void setuPaypassword(String uPaypassword) {
        this.uPaypassword = uPaypassword == null ? null : uPaypassword.trim();
    }

    public Integer getuCreditworth() {
        return uCreditworth;
    }

    public void setuCreditworth(Integer uCreditworth) {
        this.uCreditworth = uCreditworth;
    }

    public String getuRealname() {
        return uRealname;
    }

    public void setuRealname(String uRealname) {
        this.uRealname = uRealname == null ? null : uRealname.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuRealaddress() {
        return uRealaddress;
    }

    public void setuRealaddress(String uRealaddress) {
        this.uRealaddress = uRealaddress == null ? null : uRealaddress.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode == null ? null : activationCode.trim();
    }

    public String getActivationCodeTime() {
        return activationCodeTime;
    }

    public void setActivationCodeTime(String activationCodeTime) {
        this.activationCodeTime = activationCodeTime == null ? null : activationCodeTime.trim();
    }
}