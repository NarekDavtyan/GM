package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class ActionsTable implements Table {
    public static final String ACTIONS_TABLE = "Actions";
    public static final String ID = "_id";
    public static final String VK_ID = "vkId";
    public static final String FIRM_ID = "firmId";
    public static final String ACTION_ID = "actionTypeId";
    public static final String DESCRIPTION = "description";
    public static final String DATE_FILLED = "dateFilled";
    public static final String START_DATE = "startDate";
    public static final String END_DATE = "endDate";
    public static final String VERSION = "version";
    public static final String LAST_UPDATE = "lastUpdate";

    private static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
            + ACTIONS_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + VK_ID
            + " INTEGER,"
            + FIRM_ID
            + " INTEGER,"
            + ACTION_ID
            + " INTEGER NOT NULL, "
            + DESCRIPTION
            + " TEXT, "
            + DATE_FILLED
            + " DATETIME, "
            + START_DATE
            + " DATETIME, "
            + END_DATE
            + " DATETIME, "
            + VERSION
            + " INTEGER, "
            + LAST_UPDATE + " DATETIME);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }
}
