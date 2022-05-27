package com.datagrokr.assignment.multipledb.primary.entity;

import javax.persistence.*;

@Entity
public class PrimaryBook {

    @Id
    private Integer primaryBookId;
    private String primaryBookName;
    private String primaryGenre;
    private String primaryAuthor;

    public PrimaryBook() {}

    public PrimaryBook(Integer primaryBookId, String primaryBookName, String primaryGenre, String primaryAuthor) {
        this.primaryBookId = primaryBookId;
        this.primaryBookName = primaryBookName;
        this.primaryGenre = primaryGenre;
        this.primaryAuthor = primaryAuthor;
    }

    public Integer getPrimaryBookId() {
        return primaryBookId;
    }

    public void setPrimaryBookId(Integer primaryBookId) {
        this.primaryBookId = primaryBookId;
    }

    public String getPrimaryBookName() {
        return primaryBookName;
    }

    public void setPrimaryBookName(String primaryBookName) {
        this.primaryBookName = primaryBookName;
    }

    public String getPrimaryGenre() {
        return primaryGenre;
    }

    public void setPrimaryGenre(String primaryGenre) {
        this.primaryGenre = primaryGenre;
    }

    public String getPrimaryAuthor() {
        return primaryAuthor;
    }

    public void setPrimaryAuthor(String primaryAuthor) {
        this.primaryAuthor = primaryAuthor;
    }

    @Override
    public String toString() {
        return "PrimaryBook{" +
                "primaryBookId=" + primaryBookId +
                ", primaryBookName='" + primaryBookName + '\'' +
                ", primaryGenre='" + primaryGenre + '\'' +
                ", primaryAuthor='" + primaryAuthor + '\'' +
                '}';
    }
}

