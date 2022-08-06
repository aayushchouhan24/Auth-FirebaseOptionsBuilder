package com.techno.creator;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setApiKey("AIzaSyCxmj6EgbCksYmoxHrQJERfO4RAT6nk80Y")
                .setApplicationId("1:438669133318:android:d986f1504a866c36db2587")
                .setProjectId("account-creator-b3510")
                .build();
        FirebaseApp.initializeApp(this,options);
    }
}
