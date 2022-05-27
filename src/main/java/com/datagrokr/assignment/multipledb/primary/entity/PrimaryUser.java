package com.datagrokr.assignment.multipledb.primary.entity;

import javax.persistence.*;

@Entity
public class PrimaryUser {

    @Id
    private Integer primaryUserId;
    private String primaryUserName;



    public Integer getPrimaryUserId() {
        return primaryUserId;
    }

    public void setPrimaryUserId(Integer primaryUserId) {
        this.primaryUserId = primaryUserId;
    }

    public String getPrimaryUserName() {
        return primaryUserName;
    }

    public void setPrimaryUserName(String primaryUserName) {
        this.primaryUserName = primaryUserName;
    }

    public PrimaryUser() {}

    public PrimaryUser(String primaryUserName) {
        this.primaryUserName = primaryUserName;
    }

    @Override
    public String toString() {
        return "PrimaryUser{" +
                "primaryUserId=" + primaryUserId +
                ", primaryUserName='" + primaryUserName + '\'' +
                '}';
    }


}

