package com.globalgis.grand_marketing.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.globalgis.grand_marketing.R;

public class LoginActivity extends BaseActivity {

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.action_activity_login_confirm:
                    login();
                    break;
            }
        }
    };

    private EditText mUsername;
    private EditText mPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {
        mUsername = (EditText) findViewById(R.id.input_activity_login_username);
        mPassword = (EditText) findViewById(R.id.input_activity_login_password);

        findViewById(R.id.action_activity_login_confirm).setOnClickListener(mOnClickListener);
    }

    private void login() {
        if(isValidLoginData()) {
            //TODO login request
            showProgressDialog();
        } else {
            showToast(getString(R.string.toast_activity_login_empty_data));
        }
        startActivity(new Intent(this, VkActivity.class));
    }

    private boolean isValidLoginData() {
        return !TextUtils.isEmpty(mUsername.getText().toString()) && ! TextUtils.isEmpty(mPassword.getText().toString());
    }
}