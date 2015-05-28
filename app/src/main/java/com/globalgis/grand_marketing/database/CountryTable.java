package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class CountryTable extends TypeTable {
    public static final String TABLE_NAME = "Countries";

    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
            + TABLE_NAME
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + NAME
            + " TEXT,"
            + ROW
            + " INTEGER,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }
}
