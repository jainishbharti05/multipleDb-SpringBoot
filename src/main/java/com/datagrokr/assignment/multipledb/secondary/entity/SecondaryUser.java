package com.datagrokr.assignment.multipledb.secondary.entity;

import javax.persistence.*;

@Entity
public class SecondaryUser {

    @Id
    private Integer secondaryUserId;
    private String secondaryUserName;


    public SecondaryUser() {}

    public SecondaryUser(Integer secondaryUserId, String secondaryUserName) {
        this.secondaryUserId = secondaryUserId;
        this.secondaryUserName = secondaryUserName;
    }

    public Integer getSecondaryUserId() {
        return secondaryUserId;
    }

    public void setSecondaryUserId(Integer secondaryUserId) {
        this.secondaryUserId = secondaryUserId;
    }

    public String getSecondaryUserName() {
        return secondaryUserName;
    }

    public void setSecondaryUserName(String secondaryUserName) {
        this.secondaryUserName = secondaryUserName;
    }

    @Override
    public String toString() {
        return "SecondaryUser{" +
                "secondaryUserId=" + secondaryUserId +
                ", secondaryUserName='" + secondaryUserName + '\'' +
                '}';
    }
}

