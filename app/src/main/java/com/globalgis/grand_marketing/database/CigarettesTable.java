package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class CigarettesTable implements Table {
    public static final String CIGARETTES_TABLE = "Cigarettes";
    public static final String CIGARETTE_NAME = "CigaretteName";
    public static final String DESIRABLE_PRICE = "DesirablePrice";
    public static final String WHOLE_SALE_PRICE = "WholesalePrice";
    public static final String DIAMETER = "Diameter";
    public static final String FIRM_ID = "FirmId";
    public static final String LENGTH = "Length";
    public static final String NICOTINE = "Nicotine";
    public static final String TAR = "Tar";
    public static final String VVT = "Vvt";

    private static final String CREATE_TABLE_CIGARETTES = "CREATE TABLE IF NOT EXISTS "
            + CIGARETTES_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + CIGARETTE_NAME
            + " INTEGER NOT NULL,"
            + DESIRABLE_PRICE
            + " INTEGER, "
            + WHOLE_SALE_PRICE
            + " INTEGER, "
            + DIAMETER
            + " INTEGER,"
            + FIRM_ID
            + " INTEGER,"
            + LENGTH
            + " INTEGER,"
            + NICOTINE
            + " INTEGER,"
            + TAR
            + " INTEGER,"
            + VVT
            + " INTEGER,"
            + ROW
            + " INTEGER NOT NULL,"
            + VERSION
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CIGARETTES);
    }

    public static void onUpgrade(SQLiteDatabase sqLiteDatabase) {

    }
}
