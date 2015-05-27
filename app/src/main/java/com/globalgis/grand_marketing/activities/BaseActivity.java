package com.globalgis.grand_marketing.activities;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.Toast;

public abstract class BaseActivity extends FragmentActivity {

    private Toast mToast;
    private ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
    }

    private void init() {
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mProgressDialog.setCancelable(false);
    }

    protected void showToast(String message) {
        if(mToast == null) {
            mToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        }
        if (!mToast.getView().isShown()) {
            mToast.setText(message);
            mToast.show();
        }
    }

    protected void showProgressDialog() {
        if(!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }

    protected void hideProgressDialog() {
        if(mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }
}