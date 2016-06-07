package com.mozilla.hackathon.kiboko;

import android.app.Application;
import android.content.Context;

/**
 * Created by Audrey on 06/06/2016.
 */
public class App extends Application {

    protected static Context context = null;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

}
