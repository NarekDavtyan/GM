package com.globalgis.grand_marketing;

import com.globalgis.grand_marketing.app.GMApplication;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.managers.DataCollector;
import com.globalgis.grand_marketing.models.CigaretteSale;
import com.globalgis.grand_marketing.models.Vk;

import java.util.ArrayList;

public class VkInWork {

    private Vk mVk;
    private DbManager mDbManager;
    public DataCollector mDataCollector;

    private static VkInWork mInstance;

    public static VkInWork getInstance() {
        if (mInstance == null) {
            mInstance = new VkInWork();
        }

        return mInstance;
    }

    private VkInWork() {
        mDbManager = GMApplication.getDbManager();
        mDataCollector = new DataCollector();
    }

    public void startWorking(int vkId) {
        mVk = mDbManager.getVkById(vkId);
    }

    public void stopWorking() {
        mVk = null;
    }

    public void addCigaretteSales(ArrayList<CigaretteSale> cigaretteSales) {
        mDataCollector.addAllInsertData("CigaretteSales", cigaretteSales);
    }

    public String getInsertData() {
        return mDataCollector.collectInsertData();
    }

    public String getChangedData() {
        return mDataCollector.collect();
    }

    public Vk getVk() {
        return mVk;
    }
}
