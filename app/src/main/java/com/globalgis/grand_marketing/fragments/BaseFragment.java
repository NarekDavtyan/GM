package com.globalgis.grand_marketing.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {

    protected Activity mActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mActivity = activity;
    }
}