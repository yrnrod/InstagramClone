package com.codepath.rkpandey.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GO6iP32E8yINjEIOnGlxitJbbfv2rgwS5xHvgwro")
                .clientKey("dpm3FmGIhJgooaXCOu1YUPnGqFTURjGb71kzSps5")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
