package com.example.camillesaavedra.bluelippie.Classes;

/**
 * Created by Heinson on 3/7/2016.
 */
public class Follower {
    int key, userID, followerID;

    public Follower(int key, int userID, int followerID) {
        this.key = key;
        this.userID = userID;
        this.followerID = followerID;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getFollowerID() {
        return followerID;
    }

    public void setFollowerID(int followerID) {
        this.followerID = followerID;
    }
}
