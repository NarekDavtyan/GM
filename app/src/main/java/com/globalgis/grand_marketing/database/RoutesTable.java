package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class RoutesTable implements Table {

    public static final String ROUTES_TABLE = "Routs";
    public static final String VK_REGION_ID = "RegionId";
    public static final String ROUTE_NUMBER = "RouteNumber";

    private static final String CREATE_TABLE_ROUTES = "CREATE TABLE IF NOT EXISTS "
            + ROUTES_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + VK_REGION_ID
            + " INTEGER NOT NULL,"
            + ROUTE_NUMBER
            + " INTEGER NOT NULL, "
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ROUTES);
    }
}
