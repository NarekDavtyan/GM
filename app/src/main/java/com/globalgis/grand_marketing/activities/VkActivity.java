package com.globalgis.grand_marketing.activities;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.VkInWork;
import com.globalgis.grand_marketing.client.APIClient;
import com.globalgis.grand_marketing.client.APIRequestListener;
import com.globalgis.grand_marketing.fragments.*;
import org.json.JSONObject;

public class VkActivity extends BaseActivity implements ActionBar.TabListener {

    private ViewPager mViewPager;
    private MyFragmentPagerAdapter mFragmentPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager)findViewById(R.id.pager_activity_main);
        mFragmentPagerAdapter = new MyFragmentPagerAdapter(this, getSupportFragmentManager());
        mViewPager.setAdapter(mFragmentPagerAdapter);

        initTabs();
    }

    @Override
    public void onBackPressed() {
        //TODO check changed data
        showProgressDialog();
        APIClient.sendData(this, VkInWork.getInstance().getInsertData(), new APIRequestListener() {
            @Override
            public void onSuccess(String data) {
                hideProgressDialog();
                VkActivity.this.onDestroy();
            }

            @Override
            public void onFailed(String error) {
                hideProgressDialog();
                VkActivity.this.onDestroy();
            }
        });
    }

    @Override
    protected void onDestroy() {

    }

    private void initTabs() {
        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for(int i = 0; i < 6; i++) {
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mFragmentPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    private class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {

        private Context mContext;

        public MyFragmentPagerAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            switch (i) {
                case 0:
                    fragment = new AddressFragment();
                    break;
                case 1:
                    fragment = new VkInfoFragment();
                    break;
                case 2:
                    fragment = new GgimFragment();
                    break;
                case 3:
                    fragment = new MarketingFragment();
                    break;
                case 4:
                    fragment = new AdFragment();
                    break;
                case 5:
                    fragment = new GiftsFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = "";
            switch (position) {
                case 0:
                    title = mContext.getString(R.string.label_activity_main_address);
                    break;
                case 1:
                    title = mContext.getString(R.string.label_activity_main_vk_info);
                    break;
                case 2:
                    title = mContext.getString(R.string.label_activity_main_ggim);
                    break;
                case 3:
                    title = mContext.getString(R.string.label_activity_main_marketing);
                    break;
                case 4:
                    title = mContext.getString(R.string.label_activity_main_ad);
                    break;
                case 5:
                    title = mContext.getString(R.string.label_activity_main_gifts);
                    break;
            }
            return title;
        }
    }
}