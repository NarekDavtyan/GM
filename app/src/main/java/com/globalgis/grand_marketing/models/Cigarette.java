package com.globalgis.grand_marketing.models;

public class Cigarette {

    private int mId;
    private int mServerId;
    private int mRow;
    private String mName;
	private int mFirmId;
	private String mWholePrice;
	private String mDesirablePrice;
	private String mTar;
	private String mNicotine;
	private String mLength;
	private String mDiameter;
	private boolean isVvt;
	private int mVersion;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getServerId() {
        return mServerId;
    }

    public void setServerId(int serverId) {
        mServerId = serverId;
    }

    public int getRow() {
        return mRow;
    }

    public void setRow(int row) {
        mRow = row;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getFirmId() {
        return mFirmId;
    }

    public void setFirmId(int firmId) {
        mFirmId = firmId;
    }

    public String getWholePrice() {
        return mWholePrice;
    }

    public void setWholePrice(String wholePrice) {
        mWholePrice = wholePrice;
    }

    public String getDesirablePrice() {
        return mDesirablePrice;
    }

    public void setDesirablePrice(String desirablePrice) {
        mDesirablePrice = desirablePrice;
    }

    public String getTar() {
        return mTar;
    }

    public void setTar(String tar) {
        mTar = tar;
    }

    public String getNicotine() {
        return mNicotine;
    }

    public void setNicotine(String nicotine) {
        mNicotine = nicotine;
    }

    public String getLength() {
        return mLength;
    }

    public void setLength(String length) {
        mLength = length;
    }

    public String getDiameter() {
        return mDiameter;
    }

    public void setDiameter(String diameter) {
        mDiameter = diameter;
    }

    public boolean isVvt() {
        return isVvt;
    }

    public void setVvt(boolean isVvt) {
        this.isVvt = isVvt;
    }

    public int getVersion() {
        return mVersion;
    }

    public void setVersion(int version) {
        mVersion = version;
    }
}
