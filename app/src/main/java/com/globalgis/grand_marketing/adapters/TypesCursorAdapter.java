package com.globalgis.grand_marketing.adapters;

import android.content.Context;
import android.database.Cursor;
import android.widget.FilterQueryProvider;
import android.widget.SimpleCursorAdapter;

import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.database.TypeTable;

public class TypesCursorAdapter extends SimpleCursorAdapter {

    FilterQueryProvider mFilterQueryProvider = new FilterQueryProvider() {
        @Override
        public Cursor runQuery(CharSequence constraint) {
            return getCursor(constraint);
        }
    };

    private DbManager mDbManager;
    private String mTableName;

    public TypesCursorAdapter(Context context, DbManager dbManager, String tableName) {
        this(context, R.layout.row_simple_text, dbManager.getTypeObjects(tableName), new String[]{TypeTable.NAME}, new int[]{R.id.label_row_simple_text}, FLAG_REGISTER_CONTENT_OBSERVER);
        mDbManager = dbManager;
        mTableName = tableName;
        setFilterQueryProvider(mFilterQueryProvider);
    }

    public TypesCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
    }

    private Cursor getCursor(CharSequence constraint) {
        return mDbManager.filterTypeObjects(mTableName, constraint);
    }
}
