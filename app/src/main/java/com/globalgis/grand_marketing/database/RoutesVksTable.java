package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class RoutesVksTable implements Table {

    public static final String TABLE_ROUTES_VKS = "RouteVks";
    public static final String VK_CODE = "VkCode";
    public static final String ROUTE_ID = "RouteId";
    public static final String CURRENT_ROUTE_NUMBER = "CurrentRouteNumber";

    private static  final String CREATE_TABLE_ROUTES_VKS ="Create Table If not EXISTS "
            + TABLE_ROUTES_VKS
            +"("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + VK_CODE
            + " INTEGER,"
            + ROUTE_ID
            + " INTEGER,"
            + CURRENT_ROUTE_NUMBER
            + " INTEGER,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ROUTES_VKS);
    }
}
