package com.example.valentine.dailymotivaiton;

import android.app.Activity;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by valentine on 10/7/15.
 */

public class MyApp extends android.app.Application {
    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "vBfwkmZh8uXKTaI7mzcEbZIUI";
    private static final String TWITTER_SECRET = "CdGRTb8YFCfZMFOHVczFQD30TrVSgjkUFJrxL4MXVB4fxE60IS";

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

    }

}
