package com.example.realmrecyclerview;

import android.app.Application;

import io.realm.Realm;

public class RealmDemo2Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }

}
