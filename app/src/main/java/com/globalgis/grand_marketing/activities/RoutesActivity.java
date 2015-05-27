package com.globalgis.grand_marketing.activities;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import com.globalgis.grand_marketing.CurrentVkManager;
import com.globalgis.grand_marketing.GMConstants;
import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.adapters.RoutesExpandableAdapter;
import com.globalgis.grand_marketing.app.GMApplication;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.database.RoutesTable;
import com.globalgis.grand_marketing.database.VksTable;

public class RoutesActivity extends BaseActivity implements GMConstants {

    private ExpandableListView.OnGroupClickListener mOnGroupClickListener = new ExpandableListView.OnGroupClickListener() {
        @Override
        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
            return false;
        }
    };

    private ExpandableListView.OnChildClickListener mOnChildClickListener = new ExpandableListView.OnChildClickListener() {
        @Override
        public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long l) {
            Intent intent = new Intent(RoutesActivity.this, VkActivity.class);
            CurrentVkManager.createVkManager(mRoutesAdapter.getVkCode(groupPosition, childPosition));
            startActivity(intent);
            return false;
        }
    };

    private RoutesExpandableAdapter mRoutesAdapter;
    private int mVkRegionId;
    private DbManager mDbManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);

        fetchRegionId();
        init();
    }

    private void fetchRegionId() {
        Bundle extras = getIntent().getExtras();
        if(extras != null && extras.containsKey(KEYS.VK_REGION_ID)) {
            mVkRegionId = extras.getInt(KEYS.VK_REGION_ID);
        } else {
            mVkRegionId = 1; //TODO test staff
            //TODO maybe show alert and finish activity
        }
    }

    private void init() {
        mDbManager = GMApplication.getDbManager();

        Cursor groupCursor = mDbManager.fetchRoutes(mVkRegionId);
        startManagingCursor(groupCursor);
        int groupLayout = R.layout.row_activity_routes_group;
        String[] groupFrom = {RoutesTable.ROUTE_NUMBER};
        int[] groupTo = {R.id.label_activity_routes_group_name};

        int childLayout = R.layout.row_activity_routes_child;
        String[] childFrom = {VksTable.VK_NAME,
                VksTable.VK_CODE,
                VksTable.AVG_BAL,
                VksTable.ENTERPRISE_MANAGER,
                VksTable.COMPANY_NAME};
        int[] childTo = {R.id.label_activity_routes_vk_name,
                R.id.label_activity_routes_vk_code,
                R.id.label_activity_routes_vk_avg_bal,
                R.id.label_activity_routes_vk_manager,
                R.id.label_activity_routes_vk_company};

        mRoutesAdapter = new RoutesExpandableAdapter(this, mDbManager, groupCursor, groupLayout, groupFrom, groupTo, childLayout, childFrom, childTo);

        ExpandableListView expandableListView = (ExpandableListView)findViewById(R.id.exp_list_activity_routes);
        expandableListView.setOnGroupClickListener(mOnGroupClickListener);
        expandableListView.setOnChildClickListener(mOnChildClickListener);
        expandableListView.setAdapter(mRoutesAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_activity_routes_filter:
                filter();
                break;
            case R.id.action_activity_routes_exit:
                exit();
                break;
            case R.id.action_activity_routes_pause_break:
                pauseBreak();
                break;
            case R.id.action_activity_routes_product_break:
                productBreak();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void filter() {

    }

    private void exit() {

    }

    private void pauseBreak() {

    }

    private void productBreak() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_routes, menu);
        return true;
    }
}