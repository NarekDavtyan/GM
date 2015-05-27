package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class ActionCigarettesTable implements Table {
    public static final String ACTION_CIGARETTES_TABLE = "actionCigarettes";
    public static final String ACTION_ID = "actionId";
    public static final String CIGARETTE_ID = "cigaretteId";

    private static final String CREATE_TABLE_ACTION_CIGARETTES = "CREATE TABLE IF NOT EXISTS "
            + ACTION_CIGARETTES_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + ACTION_ID
            + " INTEGER,"
            + CIGARETTE_ID
            + " INTEGER,"
            + VERSION
            + " INTEGER);";

    private static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ACTION_CIGARETTES);
    }
}
