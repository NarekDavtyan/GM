package com.globalgis.grand_marketing.models;

public class Vk {
    private int mId;

	private int mOrganizationFormsId;
	private int mCategoryId;
	private int mVkClassId;
	private int mSupplyId;
    private String mEnterpriseManager;
    private String mCompanyName;
    private int mOpenedId;
    private int mCooperationId;

    private int mCountryId;
    private int mRegionId;
    private int mCityId;
    private int mStreetId;
    private String mHouse;

	private int mX;
	private int mY;
	private int mZ;

	private String mVkCode;
	private String mVkName;
	private String mPhone;
	private String mCommonNotes;
	private String mNote;
    private String mComplaintSuggestion;

    private int mAvgBal;

    private int mVersion;
	private String mHvhh;

    public Vk(int id, int organizationFormsId, int categoryId, int vkClassId, int supplyId, String enterpriseManager,
              String companyName, int openedId, int cooperationId, int countryId, int regionId, int cityId,
              int streetId, String house, int x, int y, int z, String vkCode, String vkName, String phone,
              String commonNotes, String note, String complaintSuggestion, int avgBal, int version, String hvhh) {
        mId = id;
        mOrganizationFormsId = organizationFormsId;
        mCategoryId = categoryId;
        mVkClassId = vkClassId;
        mSupplyId = supplyId;
        mEnterpriseManager = enterpriseManager;
        mCompanyName = companyName;
        mOpenedId = openedId;
        mCooperationId = cooperationId;
        mCountryId = countryId;
        mRegionId = regionId;
        mCityId = cityId;
        mStreetId = streetId;
        mHouse = house;
        mX = x;
        mY = y;
        mZ = z;
        mVkCode = vkCode;
        mVkName = vkName;
        mPhone = phone;
        mCommonNotes = commonNotes;
        mNote = note;
        mComplaintSuggestion = complaintSuggestion;
        mAvgBal = avgBal;
        mVersion = version;
        mHvhh = hvhh;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getOrganizationFormsId() {
        return mOrganizationFormsId;
    }

    public void setOrganizationFormsId(int organizationFormsId) {
        mOrganizationFormsId = organizationFormsId;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }

    public int getVkClassId() {
        return mVkClassId;
    }

    public void setVkClassId(int vkClassId) {
        mVkClassId = vkClassId;
    }

    public int getSupplyId() {
        return mSupplyId;
    }

    public void setSupplyId(int supplyId) {
        mSupplyId = supplyId;
    }

    public String getEnterpriseManager() {
        return mEnterpriseManager;
    }

    public void setEnterpriseManager(String enterpriseManager) {
        mEnterpriseManager = enterpriseManager;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(String companyName) {
        mCompanyName = companyName;
    }

    public int getOpenedId() {
        return mOpenedId;
    }

    public void setOpenedId(int openedId) {
        mOpenedId = openedId;
    }

    public int getCooperationId() {
        return mCooperationId;
    }

    public void setCooperationId(int cooperationId) {
        mCooperationId = cooperationId;
    }

    public int getCountryId() {
        return mCountryId;
    }

    public void setCountryId(int countryId) {
        mCountryId = countryId;
    }

    public int getRegionId() {
        return mRegionId;
    }

    public void setRegionId(int regionId) {
        mRegionId = regionId;
    }

    public int getCityId() {
        return mCityId;
    }

    public void setCityId(int cityId) {
        mCityId = cityId;
    }

    public int getStreetId() {
        return mStreetId;
    }

    public void setStreetId(int streetId) {
        mStreetId = streetId;
    }

    public String getHouse() {
        return mHouse;
    }

    public void setHouse(String house) {
        mHouse = house;
    }

    public int getX() {
        return mX;
    }

    public void setX(int x) {
        mX = x;
    }

    public int getY() {
        return mY;
    }

    public void setY(int y) {
        mY = y;
    }

    public int getZ() {
        return mZ;
    }

    public void setZ(int z) {
        mZ = z;
    }

    public String getVkCode() {
        return mVkCode;
    }

    public void setVkCode(String vkCode) {
        mVkCode = vkCode;
    }

    public String getVkName() {
        return mVkName;
    }

    public void setVkName(String vkName) {
        mVkName = vkName;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getCommonNotes() {
        return mCommonNotes;
    }

    public void setCommonNotes(String commonNotes) {
        mCommonNotes = commonNotes;
    }

    public String getNote() {
        return mNote;
    }

    public void setNote(String note) {
        mNote = note;
    }

    public String getComplaintSuggestion() {
        return mComplaintSuggestion;
    }

    public void setComplaintSuggestion(String complaintSuggestion) {
        mComplaintSuggestion = complaintSuggestion;
    }

    public int getAvgBal() {
        return mAvgBal;
    }

    public void setAvgBal(int avgBal) {
        mAvgBal = avgBal;
    }

    public int getVersion() {
        return mVersion;
    }

    public void setVersion(int version) {
        mVersion = version;
    }

    public String getHvhh() {
        return mHvhh;
    }

    public void setHvhh(String hvhh) {
        mHvhh = hvhh;
    }
}
