package com.example.android.tourguideapp;

import android.location.Location;

/**
 * Created by dell on 14-06-2017.
 */

public class TourGuide {
    private String mplace;
    private String mdescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public TourGuide(String place, String description, int imageResourceID) {
        mImageResourceId = imageResourceID;
        mplace = place;
        mdescription = description;

    }


    public TourGuide(String place, String description) {
        mplace = place;
        mdescription = description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPlace() {
        return mplace;
    }

    public String getDescription() {
        return mdescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
