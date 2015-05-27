package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class Action 
{
	private int mId;
	private int mVkId;
	private int mFirmId;
	private int mActionId;
	private String mDescription;
	private Calendar mDateFilled;
	private Calendar mStartDate;
	private Calendar mEndDate;
	private int mVersion;

    public Action(int id, int vkId, int firmId, int actionId, String description, Calendar dateFilled, Calendar startDate, Calendar endDate, int version) {
        mId = id;
        mVkId = vkId;
        mFirmId = firmId;
        mActionId = actionId;
        mDescription = description;
        mDateFilled = dateFilled;
        mStartDate = startDate;
        mEndDate = endDate;
        mVersion = version;
    }

    public Action(int vkId, int firmId, int actionId, String description, Calendar dateFilled, Calendar startDate, Calendar endDate, int version) {
        int id = -1;
        mVkId = vkId;
        mFirmId = firmId;
        mActionId = actionId;
        mDescription = description;
        mDateFilled = dateFilled;
        mStartDate = startDate;
        mEndDate = endDate;
        mVersion = version;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getVkId() {
        return mVkId;
    }

    public void setVkId(int vkId) {
        mVkId = vkId;
    }

    public int getFirmId() {
        return mFirmId;
    }

    public void setFirmId(int firmId) {
        mFirmId = firmId;
    }

    public int getActionId() {
        return mActionId;
    }

    public void setActionId(int actionId) {
        mActionId = actionId;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Calendar getDateFilled() {
        return mDateFilled;
    }

    public void setDateFilled(Calendar dateFilled) {
        mDateFilled = dateFilled;
    }

    public Calendar getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Calendar startDate) {
        mStartDate = startDate;
    }

    public Calendar getEndDate() {
        return mEndDate;
    }

    public void setEndDate(Calendar endDate) {
        mEndDate = endDate;
    }

    public int getVersion() {
        return mVersion;
    }

    public void setVersion(int version) {
        mVersion = version;
    }
}
