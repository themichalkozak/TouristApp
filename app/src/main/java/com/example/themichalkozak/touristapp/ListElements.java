package com.example.themichalkozak.touristapp;

/**
 * Created by themichalkozak on 03/05/2018.
 */

public class ListElements {

    private String mName;
    private int mImageResourceId;
    private String mDescription;
    private String mTelefonNumber;
    private String mWeb;
    private String eMail;

    public ListElements(String mName, int mImage, String mDescription, String mTelefonNumber, String mWeb, String eMail) {
        this.mName = mName;
        this.mImageResourceId = mImage;
        this.mDescription = mDescription;
        this.mTelefonNumber = mTelefonNumber;
        this.mWeb = mWeb;
        this.eMail = eMail;
    }

    public ListElements(String mName, int mImageResourceId) {
        this.mName = mName;
        this.mImageResourceId = mImageResourceId;
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

    public String getmTelefonNumber() {
        return mTelefonNumber;
    }

    public String getmWeb() {
        return mWeb;
    }

    public String geteMail() {
        return eMail;
    }
}
