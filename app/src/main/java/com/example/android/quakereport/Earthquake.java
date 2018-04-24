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
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
