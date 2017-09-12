package com.example.yu_enpit.mydiary;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by v039ff on 2017/08/08.
 */

public class MyDiaryApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig=new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);
    }
}
