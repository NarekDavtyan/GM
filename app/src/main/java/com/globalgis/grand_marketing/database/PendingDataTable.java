package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class PendingDataTable implements Table {

    public static final int TYPE_INSERT = 0;
    public static final int TYPE_UPDATE = 1;
    public static final int TYPE_DELETE = 2;

    public static final String TABLE_PENDING_DATA = "pending_data";
    public static final String COLUMN_DATA = "data";
    public static final String COLUMN_TYPE = "type";

    private static final String CREATE_TABLE_PENDING_DATA = "CREATE TABLE IF NOT EXISTS "
            + TABLE_PENDING_DATA
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + COLUMN_TYPE
            + " INTEGER,"
            + COLUMN_DATA
            + " TEXT);";

    public static void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_PENDING_DATA);
    }

    public static void onUpgrade(SQLiteDatabase sqLiteDatabase) {

    }
}
