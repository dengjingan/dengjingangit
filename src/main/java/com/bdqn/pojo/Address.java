package com.bdqn.pojo;

import java.util.Date;

public class Address {
    private int id;
    private String contact;
    private String addressDesc;
    private String postCode;
    private String tel;
    private int createdBy;
    private Date creationDate;
    private int modifyBy;
    private Date modifyDate;
    private int userId;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", contact='" + contact + '\'' +
                ", addressDesc='" + addressDesc + '\'' +
                ", postCode='" + postCode + '\'' +
                ", tel='" + tel + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                ", userId=" + userId +
                '}';
    }
}
