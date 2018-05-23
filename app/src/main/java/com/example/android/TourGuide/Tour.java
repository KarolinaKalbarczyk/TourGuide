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
package com.example.android.TourGuide;

/**
 * {@link Tour} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Tour {

    /** String resource ID for the default translation of the word */
    private int mDefaultTranslationId;

    /** String resource ID for the Miwok translation of the word */
    private int mTourTranslationId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Tour object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param tourTranslationId is the string resource Id for the word in the Miwok language
     */
    public Tour(int defaultTranslationId, int tourTranslationId) {
        mDefaultTranslationId = defaultTranslationId;
        mTourTranslationId = tourTranslationId;
    }

    /**
     * Create a new Tour object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param tourTranslationId is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Tour(int defaultTranslationId, int tourTranslationId, int imageResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mTourTranslationId = tourTranslationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getTourGuideTranslationId() {
        return mTourTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}