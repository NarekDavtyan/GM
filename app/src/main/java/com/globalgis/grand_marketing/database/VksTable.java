package com.globalgis.grand_marketing.database;

import android.database.sqlite.SQLiteDatabase;

public class VksTable implements Table {
    public static final String VKS_TABLE = "Vks";
    public static final String ID = "_id";
    public static final String ORGANIZATION_FORMS_ID = "OrganizationFormsId";
    public static final String CATEGORY_ID = "CategoryId";
    public static final String VK_CLASS_ID = "VKClassId";
    public static final String SUPPLY_ID = "SupplyId";
    public static final String COOPERATION_ID = "CooperationId";
    public static final String COUNTRY_ID = "CountryId";
    public static final String REGION_ID = "RegionId";
    public static final String CITY_ID = "CityId";
    public static final String STREET_ID = "StreetId";
    public static final String VK_REGION_ID = "VkRegionId";
    public static final String HOUSE = "House";
    public static final String OPENED_ID = "OpenedId";
    public static final String ENTERPRISE_MANAGER = "EnterpriseManager";
    public static final String HVHH = "Hvhh";
    public static final String X = "X";
    public static final String Y = "Y";
    public static final String Z = "Z";
    //public static final String RouteNumber = "RouteNumber";
    //public static final String CurrentRouteNumber = "CurrentRouteNumber";
    public static final String VK_CODE = "VKCode";
    public static final String VK_NAME = "VKName";
    public static final String COMPANY_NAME = "CompanyName";
    public static final String PHONE = "Phone";
    public static final String COMMON_NOTES = "CommonNotes";
    public static final String AVG_BAL = "AvgBal";
    public static final String COMPLAINT_SUGGESTION = "ComplaintSuggestion";
    public static final String NOTES = "Notes";
    public static final String INDICATIONS ="Indications";

    private static final String CREATE_TABLE_VKS = "CREATE TABLE IF NOT EXISTS "
            + VKS_TABLE
            + "("
            + ID
            + " INTEGER PRIMARY KEY,"
            + SERVER_ID
            + " INTEGER,"
            + ORGANIZATION_FORMS_ID
            + " INTEGER NOT NULL,"
            + CATEGORY_ID
            + " INTEGER, "
            + VK_CLASS_ID
            + " INTEGER NOT NULL, "
            + SUPPLY_ID
            + " INTEGER NOT NULL, "
            + COOPERATION_ID
            + " INTEGER NOT NULL,"
            + COUNTRY_ID
            + " INTEGER NOT NULL,"
            + REGION_ID
            + " INTEGER NOT NULL,"
            + CITY_ID
            + " INTEGER NOT NULL,"
            + STREET_ID
            + " INTEGER NOT NULL,"
            + VK_REGION_ID
            + " INTEGER NOT NULL, "
            + HOUSE
            + " TEXT,"
            + COMPANY_NAME
            + " TEXT,"
            + OPENED_ID
            + " INTEGER NOT NULL,"
            + ENTERPRISE_MANAGER
            + " TEXT,"
            + X
            + " INTEGER,"
            + Y
            + " INTEGER,"
            + Z
            + " INTEGER,"
            + VK_CODE
            + " TEXT,"
            + VK_NAME
            + " TEXT,"
            + PHONE
            + " TEXT,"
            + COMMON_NOTES
            + " TEXT,"
            + AVG_BAL
            + " INTEGER, "
            + COMPLAINT_SUGGESTION
            + " TEXT,"
            + HVHH
            + " TEXT, "
            + NOTES
            + " TEXT, "
            + INDICATIONS
            + " TEXT, "
            + VERSION
            + " INTEGER,"
            + ROW
            + " INTEGER);";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_VKS);
    }
}
