package com.example.android.quakereport;

/**
 * Created by loboz on 23.04.2018.
 */

/**
 * {@link Earthquake} represents an info for the single eq
 */

public class Earthquake {
    /** Eq magnitude*/
    private String mMagnitude;

    /** Eq location */
    private String mLocation;

    /** Audio resource ID for the word */
    private String mDate;;

    /**
     * Create a new Earthquake object.
     *
     * @param magnitude is the eq magnitude
     * @param location is the eq location
     * @param date is the eq date
     *
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Get the eq magnitude
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the eq location
     */
    public String getLocation() {
        return mLocation;
    }


    /**
     * Return the audio resource ID of the word.
     */
    public String getDate() {
        return mDate;
    }
}
