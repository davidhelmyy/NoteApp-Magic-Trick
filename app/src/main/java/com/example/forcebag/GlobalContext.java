package com.example.forcebag;

import android.app.Application;
import android.content.Context;

public class GlobalContext extends Application {

    private static Context context;

    public void onCreate()
    {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getContext()
    {
        return GlobalContext.context;
    }


}
