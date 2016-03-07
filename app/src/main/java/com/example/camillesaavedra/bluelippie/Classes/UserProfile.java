package com.example.camillesaavedra.bluelippie.Classes;

/**
 * Created by Heinson on 3/5/2016.
 */
public class UserProfile {
    String username;
    String password;
    String lName;
    String fName;
    String description;
    int userID;

    public UserProfile(String username, String password, String lName, String fName, String description, String picture, int userID) {
        this.username = username;
        this.password = password;
        this.lName = lName;
        this.fName = fName;
        this.description = description;
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
