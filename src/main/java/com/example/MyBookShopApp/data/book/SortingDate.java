package com.example.MyBookShopApp.data.book;

import java.util.Date;

public class SortingDate {
Date date = new Date();
Date date1 = new Date();

    public SortingDate() {
    }

    public SortingDate(Date date, Date date1) {
        this.date = date;
        this.date1 = date1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }
}
