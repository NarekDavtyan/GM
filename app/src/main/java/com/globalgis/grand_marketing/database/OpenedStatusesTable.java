package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class OpenedStatusesTable {

    public static final int OPENED_TYPE_CLOSED = 1;
    public static final int OPENED_TYPE_OPENED = 2;

    public static final String OPENED_TYPES_TABLE = "OpenedType";
    public static final String ID = "_id";
    public static final String NAME = "OpenName";
    public static final String ROW = "Row";
    public static final String VERSION = "version";

    private static final String CREATE_TABLE_OPENED_TYPES = "CREATE TABLE IF NOT EXISTS "
            + OPENED_TYPES_TABLE
            + "("
            + ID
            + " INTEGER ,"
            + NAME
            + " TEXT,"
            + ROW
            + " INTEGER,"
            + VERSION
            + " DATETIME);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_OPENED_TYPES);
    }
}
