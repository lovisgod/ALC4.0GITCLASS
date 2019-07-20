package com.lovisgod.gitsample;

import android.app.Application;
import android.content.Context;
import com.android.volley.RequestQueue;

public class NetworkRequest extends Application {

    private static NetworkRequest sInstance;
    private RequestQueue mRequestQueue;

    private


    public static synchronized NetworkRequest getInstance(Context context) {
        if(sInstance == null) {
            sInstance = new NetworkRequest();
        }
    }
}
