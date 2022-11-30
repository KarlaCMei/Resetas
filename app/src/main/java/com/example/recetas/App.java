package com.example.recetas;

import android.app.Application;

public class App extends Application {
    public static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public App getInstance(){
        if(instance == null) instance = this;
        return instance;
    }
}
