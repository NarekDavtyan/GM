package com.globalgis.grand_marketing.app;

import android.app.Application;
import com.globalgis.grand_marketing.database.DbManager;

public class GMApplication extends Application {

    private static DbManager mDbManager;

    @Override
    public void onCreate() {
        super.onCreate();

        mDbManager = new DbManager(this);
        mDbManager.open();
    }

    public static DbManager getDbManager() {
        return mDbManager;
    }
}
