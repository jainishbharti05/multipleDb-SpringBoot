package com.datagrokr.assignment.multipledb.secondary.entity;

import javax.persistence.*;

@Entity
public class SecondaryBook {

    @Id
    private Integer secondaryBookId;
    private String secondaryBookName;
    private String secondaryGenre;
    private String secondaryAuthor;

    public SecondaryBook() {}

    public SecondaryBook(Integer secondaryBookId, String secondaryBookName, String secondaryGenre, String secondaryAuthor) {
        this.secondaryBookId = secondaryBookId;
        this.secondaryBookName = secondaryBookName;
        this.secondaryGenre = secondaryGenre;
        this.secondaryAuthor = secondaryAuthor;
    }

    public Integer getSecondaryBookId() {
        return secondaryBookId;
    }

    public void setSecondaryBookId(Integer secondaryBookId) {
        this.secondaryBookId = secondaryBookId;
    }

    public String getSecondaryBookName() {
        return secondaryBookName;
    }

    public void setSecondaryBookName(String secondaryBookName) {
        this.secondaryBookName = secondaryBookName;
    }

    public String getSecondaryGenre() {
        return secondaryGenre;
    }

    public void setSecondaryGenre(String secondaryGenre) {
        this.secondaryGenre = secondaryGenre;
    }

    public String getSecondaryAuthor() {
        return secondaryAuthor;
    }

    public void setSecondaryAuthor(String secondaryAuthor) {
        this.secondaryAuthor = secondaryAuthor;
    }

    @Override
    public String toString() {
        return "SecondaryBook{" +
                "secondaryBookId=" + secondaryBookId +
                ", secondaryBookName='" + secondaryBookName + '\'' +
                ", secondaryGenre='" + secondaryGenre + '\'' +
                ", secondaryAuthor='" + secondaryAuthor + '\'' +
                '}';
    }
}

