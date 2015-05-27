package com.globalgis.grand_marketing.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.util.SparseArray;
import com.globalgis.grand_marketing.models.Cigarette;
import com.globalgis.grand_marketing.models.CigaretteSale;
import com.globalgis.grand_marketing.models.Firm;
import com.globalgis.grand_marketing.models.Vk;

import java.util.ArrayList;

public class DbManager {
    private SQLiteDatabase mDatabase;
    private DbHelper mDbHelper;

    private static final String TAG = DbManager.class.getName();

    public DbManager(Context context) {
        mDbHelper = new DbHelper(context);
    }

    public void open() throws SQLException {
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close() {
        mDbHelper.close();
    }

    public Cursor fetchRoutes(int vkRegionId) {
        Cursor cursor = mDatabase.query(RoutesTable.ROUTES_TABLE, null, RoutesTable.VK_REGION_ID + " = ?", new String[]{String.valueOf(vkRegionId)},
                null, null, null);

        return cursor;
    }

    public Cursor fetchVksByRoute(int routeNumber, boolean showOnlyOpened) {
        String sql = "SELECT A." + VksTable.ID + ", A." + VksTable.VK_NAME + ", A." + VksTable.VK_CODE
                + ", A." + VksTable.AVG_BAL + ", A." + VksTable.ENTERPRISE_MANAGER + ", A." + VksTable.COMPANY_NAME
                + " FROM " + VksTable.VKS_TABLE +  " A,"
                + RoutesTable.ROUTES_TABLE + " B," + RoutesVksTable.TABLE_ROUTES_VKS + " C"
                + " WHERE A." + VksTable.VK_REGION_ID + " = B." + RoutesTable.VK_REGION_ID
                + " AND B. " + RoutesTable.SERVER_ID + " = C." + RoutesVksTable.ROUTE_ID
                + " AND A." + VksTable.VK_CODE + " = C." + RoutesVksTable.VK_CODE
                + " AND B." + RoutesTable.ROUTE_NUMBER + " = ?";
        String[] args;
        if(showOnlyOpened) {
            args = new String[]{String.valueOf(routeNumber), String.valueOf(OpenedStatusesTable.OPENED_TYPE_OPENED)};
            sql += " AND A." + VksTable.OPENED_ID + " = ?";
        } else {
            args = new String[]{String.valueOf(routeNumber)};
        }

        sql += " GROUP BY " + "A." + VksTable.VK_CODE;

        return mDatabase.rawQuery(sql, args);
    }

    public Vk getVkById(int vkId) {
        Cursor cursor = mDatabase.query(VksTable.VKS_TABLE, null, VksTable.ID + "= ?", new String[]{String.valueOf(vkId)},
                null, null, null);

        return DbUtils.getVkFromCursor(cursor);
    }

    public ArrayList<Firm> getFirms() {
        Cursor cursor = mDatabase.query(FirmsTable.FIRMS_TABLE, null, null, null, null, null, FirmsTable.ROW);
        return DbUtils.getFirmListFromCursor(cursor);
    }

    public void updateOrInsertCigaretteSale(int cigaretteId, int vkId, ContentValues values) {
        int updated = mDatabase.update(CigaretteSalesTable.CIGARETTE_SALES_TABLE, values,
                CigaretteSalesTable.CIGARETTE_ID + " = ? AND "
                        + CigaretteSalesTable.VK_ID + " = ?",
                new String[]{String.valueOf(cigaretteId), String.valueOf(vkId)});
        if(updated == 0) {
            mDatabase.insert(CigaretteSalesTable.CIGARETTE_SALES_TABLE, null, values);
        }
    }

    public ArrayList<CigaretteSale> getCigaretteSales(int vkId) {
        Cursor cursor = mDatabase.query(CigaretteSalesTable.CIGARETTE_SALES_TABLE, null, CigaretteSalesTable.VK_ID + "= ?", new String[]{String.valueOf(vkId)},
                null, null, null);

        return DbUtils.getCigaretteSaleListFromCursor(cursor);
    }

    public SparseArray<CigaretteSale> getCigaretteSalesSparse(int vkId) {
        Cursor cursor = mDatabase.query(CigaretteSalesTable.CIGARETTE_SALES_TABLE, null, CigaretteSalesTable.VK_ID + "= ?", new String[]{String.valueOf(vkId)},
                null, null, null);

        return DbUtils.getCigaretteSaleSparseFromCursor(cursor);
    }

    public ArrayList<Cigarette> getCigarettesByFirm(int firmId) {
        return new ArrayList<Cigarette>();
    }

    public ArrayList<Cigarette> getCigarettes() {
        Cursor cursor = mDatabase.query(CigarettesTable.CIGARETTES_TABLE, null, null, null, null, null, CigarettesTable.ROW);
        return DbUtils.getCigarettesFromCursor(cursor);
    }

    public void insertOrUpdate(String tableName, ContentValues values) {
        if(values.containsKey(Table.ID)) {
            int update = mDatabase.update(tableName, values, Table.ID + " = ?", new String[]{values.getAsString(Table.ID)});
            if(update == 0) {
                long insertedId = mDatabase.insert(tableName, null, values);
                Log.d(TAG, String.format("Inserted in %s (%d)", tableName, insertedId));
            } else {
                Log.d(TAG, String.format("Update in %s", tableName));
            }
        } else {
            long insertedId = mDatabase.insert(tableName, null, values);
            Log.d(TAG, String.format("Inserted in %s (%d)", tableName, insertedId));
            Log.d(TAG, String.format("Data for %s doesn't contains 'id'", tableName));
        }
    }
}
