package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class CigaretteSalesTable implements Table {
    public static final String CIGARETTE_SALES_TABLE = "CigaretteSales";
    public static final String CIGARETTE_ID = "CigaretteId";
    public static final String VK_ID = "VkId";
    public static final String PRICE = "Price";
    public static final String SALES_COUNT = "SalesCount";

    private static final String CREATE_TABLE_CIGARETTE_SALES = "CREATE TABLE IF NOT EXISTS "
            + CIGARETTE_SALES_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + CIGARETTE_ID
            + " INTEGER NOT NULL,"
            + VK_ID
            + " INTEGER NOT NULL, "
            + PRICE
            + " INTEGER NOT NULL, "
            + SALES_COUNT
            + " INTEGER NOT NULL,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CIGARETTE_SALES);
    }

    public static void onUpgrade(SQLiteDatabase sqLiteDatabase) {

    }
}
