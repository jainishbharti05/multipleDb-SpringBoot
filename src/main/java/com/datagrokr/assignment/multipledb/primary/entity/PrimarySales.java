package com.datagrokr.assignment.multipledb.primary.entity;

import javax.persistence.*;

@Entity
public class PrimarySales {

    @Id
    private Integer primarySalesId;

    @OneToOne
    @JoinColumn(name = "primaryuserid", referencedColumnName = "primaryUserId")
    private PrimaryUser primaryUserId;

    @OneToOne
    @JoinColumn(name = "primarybookid", referencedColumnName = "primaryBookId")
    private PrimaryBook primaryBookId;

    public PrimarySales() {}

    public PrimarySales(PrimaryUser primaryUserId, PrimaryBook primaryBookId) {
        this.primaryUserId = primaryUserId;
        this.primaryBookId = primaryBookId;
    }

    public Integer getPrimarySalesId() {
        return primarySalesId;
    }

    public void setPrimarySalesId(Integer primarySalesId) {
        this.primarySalesId = primarySalesId;
    }

    public PrimaryUser getPrimaryUserId() {
        return primaryUserId;
    }

    public void setPrimaryUserId(PrimaryUser primaryUserId) {
        this.primaryUserId = primaryUserId;
    }

    public PrimaryBook getPrimaryBookId() {
        return primaryBookId;
    }

    public void setPrimaryBookId(PrimaryBook primaryBookId) {
        this.primaryBookId = primaryBookId;
    }

    @Override
    public String toString() {
        return "PrimarySales{" +
                "primarySalesId=" + primarySalesId +
                ", primaryUserId=" + primaryUserId +
                ", primaryBookId=" + primaryBookId +
                '}';
    }
}
