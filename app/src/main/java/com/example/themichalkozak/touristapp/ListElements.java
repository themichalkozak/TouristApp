package com.example.themichalkozak.touristapp;

/**
 * Created by themichalkozak on 03/05/2018.
 */

public class ListElements {

    private String mName;
    private int mImageResourceId;
    private String mDescription;


    public ListElements(String mName, int mImage, String mDescription, String mTelefonNumber, String mWeb, String eMail) {
        this.mName = mName;
        this.mImageResourceId = mImage;
        this.mDescription = mDescription;

    }

    public ListElements(String mName, int mImageResourceId, String mDescription) {
        this.mName = mName;
        this.mImageResourceId = mImageResourceId;
        this.mDescription =mDescription;
    }

    public String getmName() {
        return mName;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmDescription() {
        return mDescription;
    }

}
