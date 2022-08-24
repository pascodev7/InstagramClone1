package com.pascaljeanty.instagramclone2;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    public void onCreate () {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("EDyqLcNrvG4Ukk9gOu6eiOaOtlC6oIlSuaj95B3j")
                .clientKey("lNj1lkryqS40ABN1lWmBylaI9909A6vG0w32EXMf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
