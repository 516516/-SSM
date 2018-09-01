package com.bobo.keyan.hdb.model;

public class Credit {
    private Integer cId;

    private String cCardnum;

    private Integer cUserid;

    private String cPaypassword;

    private String cBankname;

    private String cProvince;

    private String cPhone;

    private String cBankadress;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcCardnum() {
        return cCardnum;
    }

    public void setcCardnum(String cCardnum) {
        this.cCardnum = cCardnum == null ? null : cCardnum.trim();
    }

    public Integer getcUserid() {
        return cUserid;
    }

    public void setcUserid(Integer cUserid) {
        this.cUserid = cUserid;
    }

    public String getcPaypassword() {
        return cPaypassword;
    }

    public void setcPaypassword(String cPaypassword) {
        this.cPaypassword = cPaypassword == null ? null : cPaypassword.trim();
    }

    public String getcBankname() {
        return cBankname;
    }

    public void setcBankname(String cBankname) {
        this.cBankname = cBankname == null ? null : cBankname.trim();
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcBankadress() {
        return cBankadress;
    }

    public void setcBankadress(String cBankadress) {
        this.cBankadress = cBankadress == null ? null : cBankadress.trim();
    }
}