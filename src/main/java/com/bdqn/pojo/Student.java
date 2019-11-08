package com.bdqn.pojo;

public class Student {
    private String sgender;
    private int sage;
    private String address;
    private int sid;
    private String sname;

    private String semail;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sgender=" + sgender + ", sage=" + sage + ", address="
                + address + ", semail=" + semail + "]";
    }

}
