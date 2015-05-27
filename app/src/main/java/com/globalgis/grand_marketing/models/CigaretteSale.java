package com.globalgis.grand_marketing.models;

import com.globalgis.grand_marketing.interfaces.DataCollectible;
import org.json.JSONException;
import org.json.JSONObject;

public class CigaretteSale implements DataCollectible {

    private int mId;
    private int mCigaretteId;
    private int mVkId;
    private int mPrice;
    private int mSalesCount;
	private int mVersion;

    public CigaretteSale(int id, int cigaretteId, int vkId, int price, int salesCount, int version) {
        mId = id;
        mCigaretteId = cigaretteId;
        mVkId = vkId;
        mPrice = price;
        mSalesCount = salesCount;
        mVersion = version;
    }

    public CigaretteSale(int cigaretteId, int vkId, int price, int salesCount) {
        mId = 0;
        mCigaretteId = cigaretteId;
        mVkId = vkId;
        mPrice = price;
        mSalesCount = salesCount;
        mVersion = 0;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getCigaretteId() {
        return mCigaretteId;
    }

    public void setCigaretteId(int cigaretteId) {
        mCigaretteId = cigaretteId;
    }

    public int getVkId() {
        return mVkId;
    }

    public void setVkId(int vkId) {
        mVkId = vkId;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int price) {
        mPrice = price;
    }

    public int getSalesCount() {
        return mSalesCount;
    }

    public void setSalesCount(int salesCount) {
        mSalesCount = salesCount;
    }

    public int getVersion() {
        return mVersion;
    }

    public void setVersion(int version) {
        mVersion = version;
    }

    @Override
    public JSONObject collect() throws JSONException {
        JSONObject saleJSON = new JSONObject();
        saleJSON.put("id", getId());
        saleJSON.put("CigaretteId", getCigaretteId());
        saleJSON.put("Price", getPrice());
        saleJSON.put("SalesCount", getSalesCount());
        return saleJSON;
    }
}
