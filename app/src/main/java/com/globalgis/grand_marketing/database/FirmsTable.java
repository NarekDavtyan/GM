package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class FirmsTable implements Table{
    public static final String FIRMS_TABLE = "Fiems";//TODO change after server side change
    public static final String NAME = "FirmName";
    public static final String IS_OWN = "Own";

    private static final String CREATE_TABLE_FIRMS = "CREATE TABLE IF NOT EXISTS "
            + FIRMS_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + ROW
            + " INTEGER,"
            + NAME
            + " TEXT,"
            + IS_OWN
            + " BOOLEAN,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_FIRMS);
    }
}
