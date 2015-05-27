package com.globalgis.grand_marketing.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.globalgis.grand_marketing.CurrentVkManager;
import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.VkInWork;
import com.globalgis.grand_marketing.adapters.FirmsSpinnerAdapter;
import com.globalgis.grand_marketing.adapters.SalesPagerAdapter;
import com.globalgis.grand_marketing.app.GMApplication;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.models.Cigarette;
import com.globalgis.grand_marketing.models.CigaretteSale;
import com.globalgis.grand_marketing.models.Firm;

import java.util.ArrayList;

public class MarketingFragment extends BaseFragment {

    private AdapterView.OnItemSelectedListener mOnFirmSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
            showFirmSales(mFirmsAdapter.getItemId(position));
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.label_fragment_marketing_next:
                    showNext();
                    break;
                case R.id.label_fragment_marketing_previous:
                    showPrevious();
                    break;
            }
        }
    };

    private static final int ITEMS_PER_PAGE = 4;

    private SparseArray<CigaretteSale> mCigaretteSales;
    private ArrayList<Cigarette> mCigarettes;

    private FirmsSpinnerAdapter mFirmsAdapter;
    private ViewPager mPager;
    private SalesPagerAdapter mSalesPagerAdapter;

    private int mVkId;

    private DbManager mDbManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_marketing, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        initView(view);
    }

    private void initView(View root) {
        initSpinner(root);

        mSalesPagerAdapter = new SalesPagerAdapter(mActivity, mCigaretteSales);
        mPager = (ViewPager)root.findViewById(R.id.pager_fragment_marketing_sales_container);
        mPager.setAdapter(mSalesPagerAdapter);
        mPager.setOffscreenPageLimit(2);
        root.findViewById(R.id.label_fragment_marketing_next).setOnClickListener(mOnClickListener);
        root.findViewById(R.id.label_fragment_marketing_previous).setOnClickListener(mOnClickListener);
    }

    private void init() {
        mDbManager = GMApplication.getDbManager();
        mVkId = CurrentVkManager.getInstance().getCurrentVkCode();
        mCigarettes = mDbManager.getCigarettes();
        fillSales();
    }

    private void fillSales() {
        mCigaretteSales = mDbManager.getCigaretteSalesSparse(mVkId);
        for(Cigarette cigarette: mCigarettes) {
            int cigaretteId = cigarette.getId();
            if(mCigaretteSales.get(cigaretteId, null) == null) {
                CigaretteSale cigaretteSale = new CigaretteSale(cigarette.getId(), mVkId, 0, 0);
                mCigaretteSales.put(cigaretteId, cigaretteSale);
            }
        }
    }

    private void initSpinner(View root) {
        ArrayList<Firm> firms = mDbManager.getFirms();
        mFirmsAdapter = new FirmsSpinnerAdapter(mActivity, firms);
        Spinner firmsSpinner = (Spinner)root.findViewById(R.id.spinner_fragment_marketing_firms);
        firmsSpinner.setAdapter(mFirmsAdapter);
        firmsSpinner.setOnItemSelectedListener(mOnFirmSelectedListener);
    }

    private void showFirmSales(long firmId) {
        ArrayList<Cigarette> currentCigarettes = getFirmCigarettes(firmId);
        updatePager(currentCigarettes);
    }

    private ArrayList<Cigarette> getFirmCigarettes(long firmId) {
        ArrayList<Cigarette> cigarettes = new ArrayList<Cigarette>();
        if(firmId != -1) {
            for (Cigarette cigarette : mCigarettes) {
                if (cigarette.getFirmId() == firmId) {
                    cigarettes.add(cigarette);
                }
            }
        } else {
            cigarettes = mCigarettes;
        }

        return cigarettes;
    }

    private void updatePager(final ArrayList<Cigarette> cigarettes) {
        mSalesPagerAdapter.update(cigarettes);
    }

    private void showNext() {
        int currentIndex = mPager.getCurrentItem();
        if(currentIndex < mSalesPagerAdapter.getCount() - 1) {
            mPager.setCurrentItem(currentIndex + 1);
        }

        saveData();
    }

    private void showPrevious() {
        int currentIndex = mPager.getCurrentItem();
        if(currentIndex != 0) {
            mPager.setCurrentItem(currentIndex - 1);
        }
    }

    private void saveData() {
        ArrayList<CigaretteSale> cigaretteSales = new ArrayList<CigaretteSale>();
        for (int i = 0; i < 15; i++) {
            cigaretteSales.add(mCigaretteSales.get(mCigarettes.get(i).getId()));
        }

        VkInWork.getInstance().addCigaretteSales(cigaretteSales);
    }
}