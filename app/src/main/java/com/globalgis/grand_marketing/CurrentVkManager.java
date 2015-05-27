package com.globalgis.grand_marketing;

public class CurrentVkManager {

    private int mCurrentVkCode;

    private static CurrentVkManager mInstance;

    public static void createVkManager(int currentVkCode) {
        mInstance = new CurrentVkManager(currentVkCode);
    }

    public static CurrentVkManager getInstance() {
        return mInstance;
    }

    private CurrentVkManager(int currentVkCode) {
        mCurrentVkCode = currentVkCode;
    }

    public int getCurrentVkCode() {
        return mCurrentVkCode;
    }
}
