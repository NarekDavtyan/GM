package com.globalgis.grand_marketing.models;

public class Firm {
	private int mId;
	private int mRow;
	private String mFirmName;
	private Boolean isOwn;
	private int mVersion;

    public Firm(int id, int row, String firmName, Boolean isOwn, int version) {
        mId = id;
        mRow = row;
        mFirmName = firmName;
        this.isOwn = isOwn;
        mVersion = version;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getRow() {
        return mRow;
    }

    public void setRow(int row) {
        mRow = row;
    }

    public String getFirmName() {
        return mFirmName;
    }

    public void setFirmName(String firmName) {
        mFirmName = firmName;
    }

    public Boolean getIsOwn() {
        return isOwn;
    }

    public void setIsOwn(Boolean isOwn) {
        this.isOwn = isOwn;
    }

    public int getVersion() {
        return mVersion;
    }

    public void setVersion(int version) {
        mVersion = version;
    }
}
