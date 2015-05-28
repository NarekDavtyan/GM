package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class OrganizationFormTable implements Table {
    public static final String TABLE_NAME = "OrganizationFormTypes";
    public static final String NAME = "name";

    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
            + TABLE_NAME
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + NAME
            + " TEXT,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_NAME);
    }
}
