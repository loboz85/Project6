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

/**
 * An {@link News} object contains information related to a single earthquake.
 */
public class News {

    /**
     * Article's section name
     */
    private String mSection;

    /**
     * Article's title
     */
    private String mTitle;

    /**
     * Time adding article
     */
    private String mTime;

    /**
     * Website URL of the article
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param section is the magnitude (size) of the earthquake
     * @param title   is the location where the earthquake happened
     * @param time    is the time in milliseconds (from the Epoch) when the
     *                earthquake happened
     * @param url     is the website URL to find more details about the earthquake
     */
    public News(String section, String title, String time, String url) {
        mSection = section;
        mTitle = title;
        mTime = time;
        mUrl = url;
    }

    /**
     * Returns article's section.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the time of the article.
     */
    public String getTime() {
        return mTime;
    }

    /**
     * Returns the website URL to write the article.
     */
    public String getUrl() {
        return mUrl;
    }
}