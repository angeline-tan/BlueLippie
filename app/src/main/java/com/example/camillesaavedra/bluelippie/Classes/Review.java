package com.example.camillesaavedra.bluelippie.Classes;

import java.util.Date;

/**
 * Created by camillesaavedra on 16/02/2016.
 */
public class Review {

    String user, title, description, brand;
    Date date;
    int reviewID,userID;

    public Review(String user, String title, String description, String brand, int reviewID, int userID, Date date) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.brand = brand;
        this.reviewID = reviewID;
        this.userID = userID;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public int getUserID() { return userID; }

    public void setUserID(int userID) { this.userID = userID; }
}
