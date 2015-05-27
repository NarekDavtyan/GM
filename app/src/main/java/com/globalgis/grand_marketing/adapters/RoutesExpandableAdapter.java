package com.globalgis.grand_marketing.adapters;

import android.content.Context;
import android.database.Cursor;
import android.widget.SimpleCursorTreeAdapter;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.database.RoutesTable;
import com.globalgis.grand_marketing.database.VksTable;

public class RoutesExpandableAdapter extends SimpleCursorTreeAdapter {

    private DbManager mDbManager;

    public RoutesExpandableAdapter(Context context, DbManager dbManager, Cursor cursor, int groupLayout,
                                   String[] groupFrom, int[] groupTo, int childLayout, String[] childFrom, int[] childTo) {
        super(context, cursor, groupLayout, groupFrom, groupTo, childLayout, childFrom, childTo);
        mDbManager = dbManager;
    }

    @Override
    protected Cursor getChildrenCursor(Cursor cursor) {
        int routeNumber = cursor.getInt(cursor.getColumnIndex(RoutesTable.ROUTE_NUMBER));
        Cursor childCursor = mDbManager.fetchVksByRoute(routeNumber, false);
        return childCursor;
    }

    public int getVkCode(int groupPosition, int childPosition) {
        Cursor cursor = getChild(groupPosition, childPosition);
        return cursor.getInt(cursor.getColumnIndex(VksTable.VK_CODE));
    }
}
