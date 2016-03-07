package com.example.camillesaavedra.bluelippie.Classes;

/**
 * Created by Heinson on 3/7/2016.
 */
public class Following {
    int key,userID,followingID;

    public Following(int key, int userID, int followingID) {
        this.key = key;
        this.userID = userID;
        this.followingID = followingID;
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

    public int getFollowingID() {
        return followingID;
    }

    public void setFollowingID(int followingID) {
        this.followingID = followingID;
    }
}
