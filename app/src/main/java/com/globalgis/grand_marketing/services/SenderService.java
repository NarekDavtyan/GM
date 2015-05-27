package com.globalgis.grand_marketing.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;

import com.globalgis.grand_marketing.client.APIClient;

import java.util.ArrayList;

public class SenderService extends IntentService {

    private static final int SENDER_TASK_FREQUENCY = 2 * 60 * 1000;

    private boolean isRunning;
    private Handler mScheduleHandler;
    private Runnable mSenderTask;

    private static final String TAG = SenderService.class.getSimpleName();

    public SenderService() {
        super(TAG);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        if(!isRunning) {
            isRunning = true;
            mScheduleHandler = new Handler();
            mSenderTask = new Runnable() {
                @Override
                public void run() {
                    tryToSendPendingData();
                    mScheduleHandler.postDelayed(mSenderTask, SENDER_TASK_FREQUENCY);
                }
            };
        }
    }

    private void tryToSendPendingData() {
    }

    private ArrayList<String> getPendingData() {
        return new ArrayList<>();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
