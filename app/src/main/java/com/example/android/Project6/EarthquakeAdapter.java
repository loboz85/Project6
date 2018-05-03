/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.Project6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link EarthquakeAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Earthquake} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    /**
     * The part of the location string from the USGS service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */
    private static final String LOCATION_SEPARATOR = " | ";

    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.section);
        // Format the magnitude to show 1 decimal place
        String formattedMagnitude = currentEarthquake.getMagnitude();
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(formattedMagnitude);

        // Find the TextView with view ID location
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.article_topic);
        // Get the original location string from the Earthquake object,
        // which can be in the format of "5km N of Cairo, Egypt" or "Pacific-Antarctic Ridge".
        String originalLocation = currentEarthquake.getLocation();

//        //jezeli nie zawiera | (location separator) wyswietlasz original caly, jak zawiera tylko czesc przed |
//       // Check whether the originalLocation string contains the " of " text
//       if (originalLocation.contains(LOCATION_SEPARATOR)) {
//           // Split the string into different parts (as an array of Strings)
//           // based on the " of " text. We expect an array of 2 Strings, where
//           // the first String will be "5km N" and the second String will be "Cairo, Egypt".
//           String[] parts = originalLocation.split(LOCATION_SEPARATOR);
//           // Location offset should be "5km N " + " of " --> "5km N of"
//           originalLocation = parts[0];
//       }
//        } else {
//            // Otherwise, there is no " of " text in the originalLocation string.
//            // Hence, set the default location offset to say "Near the".
//            // The primary location will be the full location string "Pacific-Antarctic Ridge".
//            originalLocation = originalLocation;
//        }

        // Display the location of the current earthquake in that TextView
        primaryLocationView.setText(originalLocation);

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = currentEarthquake.getTimeInMilliseconds();
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}