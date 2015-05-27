package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class VkClassesTable implements Table {
    public static final String VK_CLASSES_TABLE = "VkClasses";
    public static final String ID = "_id";
    public static final String NAME = "name";
    public static final String COEFFICIENT = "coefficient";
    public static final String ROW = "row";
    public static final String VERSION = "version";
    public static final String LAST_UPDATE = "lastUpdate";

    private static final String CREATE_TABLE_VK_CLASSES = "CREATE TABLE IF NOT EXISTS "
            + VK_CLASSES_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + NAME
            + " TEXT,"
            + COEFFICIENT
            + " INTEGER,"
            + ROW
            + " INTEGER,"
            + VERSION
            + " INTEGER,"
            + LAST_UPDATE
            + " DATETIME);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_VK_CLASSES);
    }
}
