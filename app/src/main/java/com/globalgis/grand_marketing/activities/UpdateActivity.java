package com.globalgis.grand_marketing.activities;

import android.content.Intent;
import android.os.Bundle;
import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.client.APIClient;
import com.globalgis.grand_marketing.client.APIRequestListener;
import com.globalgis.grand_marketing.interfaces.IParserStatusListener;
import com.globalgis.grand_marketing.utils.UpdateParserTask;

public class UpdateActivity extends BaseActivity {

    private APIRequestListener mUpdateListener = new APIRequestListener() {
        @Override
        public void onSuccess(final String data) {
            parseUpdateResult(data);
        }

        @Override
        public void onFailed(String error) {
            hideProgressDialog();
        }
    };

    private IParserStatusListener mParserStatusListener = new IParserStatusListener() {
        @Override
        public void completed() {
            hideProgressDialog();
            startActivity(new Intent(UpdateActivity.this, RoutesActivity.class));
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        update();
    }

    private void update() {
        showProgressDialog();
        APIClient.update(this, mUpdateListener);
    }

    private void parseUpdateResult(String data) {
        new UpdateParserTask(data, mParserStatusListener).execute();
    }
}