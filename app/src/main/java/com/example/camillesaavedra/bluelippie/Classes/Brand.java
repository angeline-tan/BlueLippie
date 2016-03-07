package com.example.camillesaavedra.bluelippie.Classes;

/**
 * Created by Heinson on 3/7/2016.
 */
public class Brand {
    int brandID;
    String brandName;

    public Brand(int brandID, String brandName) {
        this.brandID = brandID;
        this.brandName = brandName;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
