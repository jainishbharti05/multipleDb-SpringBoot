package com.datagrokr.assignment.multipledb.secondary.entity;

import javax.persistence.*;

@Entity
public class SecondarySales {

    @Id
    private Integer secondarySalesId;

    @OneToOne
    @JoinColumn(name = "secondaryuserid", referencedColumnName = "secondaryUserId")
    private SecondaryUser secondarySecondaryUserId;

    @OneToOne
    @JoinColumn(name = "secondarybookid", referencedColumnName = "secondaryBookId")
    private SecondaryBook secondaryBookId;

    public SecondarySales() {}

    public SecondarySales(Integer secondarySalesId, SecondaryUser secondarySecondaryUserId, SecondaryBook secondaryBookId) {
        this.secondarySalesId = secondarySalesId;
        this.secondarySecondaryUserId = secondarySecondaryUserId;
        this.secondaryBookId = secondaryBookId;
    }

    public Integer getSecondarySalesId() {
        return secondarySalesId;
    }

    public void setSecondarySalesId(Integer secondarySalesId) {
        this.secondarySalesId = secondarySalesId;
    }

    public SecondaryUser getSecondaryUserId() {
        return secondarySecondaryUserId;
    }

    public void setSecondaryUserId(SecondaryUser secondarySecondaryUserId) {
        this.secondarySecondaryUserId = secondarySecondaryUserId;
    }

    public SecondaryBook getSecondaryBookId() {
        return secondaryBookId;
    }

    public void setSecondaryBookId(SecondaryBook secondaryBookId) {
        this.secondaryBookId = secondaryBookId;
    }

    @Override
    public String toString() {
        return "SecondarySales{" +
                "secondarySalesId=" + secondarySalesId +
                ", secondaryUserId=" + secondarySecondaryUserId +
                ", secondaryBookId=" + secondaryBookId +
                '}';
    }
}
