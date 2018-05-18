package com.example.themichalkozak.touristapp;

/**
 * Created by themichalkozak on 03/05/2018.
 */

public class ListElements {

    private String mName;
    private int mImageResourceId;
    private String mDescription;
    private String siteURL;
    private String mTelefon;
    private String mEmailAdress;

    public ListElements(String mName, int mImageResourceId, String mDescription) {
        this.mName = mName;
        this.mImageResourceId = mImageResourceId;
        this.mDescription =mDescription;
    }

    public ListElements(String mName, int mImageResourceId, String mDescription,String siteURL,String mTelefon,String mEmailAdress) {
        this.mName = mName;
        this.mImageResourceId = mImageResourceId;
        this.mDescription =mDescription;
        this.siteURL = siteURL;
        this.mTelefon = mTelefon;
        this.mEmailAdress = mEmailAdress;
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

    public String getSiteURL() {
        return siteURL;
    }

    public String getmTelefon() {
        return mTelefon;
    }

    public String getmEmailAdress() {
        return mEmailAdress;
    }
}
