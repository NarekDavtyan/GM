package com.globalgis.grand_marketing.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "marketing.db";
    private static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        RoutesTable.onCreate(sqLiteDatabase);
        RoutesVksTable.onCreate(sqLiteDatabase);
        VksTable.onCreate(sqLiteDatabase);
        FirmsTable.onCreate(sqLiteDatabase);
        CigaretteSalesTable.onCreate(sqLiteDatabase);
        CigarettesTable.onCreate(sqLiteDatabase);
        PendingDataTable.onCreate(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
