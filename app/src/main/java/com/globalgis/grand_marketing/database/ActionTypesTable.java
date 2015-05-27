package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class ActionTypesTable implements Table {
    public static final String ACTIONS_TYPES_TABLE = "ActionTypes";
    public static final String ACTION_NAME = "actionName";

    private static final String CREATE_TABLE_ACTIONS_TYPE = "CREATE TABLE IF NOT EXISTS "
            + ACTIONS_TYPES_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + ACTION_NAME
            + " TEXT,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ACTIONS_TYPE);
    }
}
