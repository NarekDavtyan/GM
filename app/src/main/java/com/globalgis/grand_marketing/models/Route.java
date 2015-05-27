package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class Route {

	private int mId = 0;
	private int mVkRegionId;
	private int mRouteNumber;
	private int mVersion;
	private Calendar mLastUpdate;
	
	public Route(int vkRegionId, int routeNumber) {
		this.mVkRegionId = vkRegionId;
		this.mRouteNumber = routeNumber;
	}

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		this.mId = id;
	}

	public int getVkRegionId() {
		return mVkRegionId;
	}

	public void setVkRegionId(int vkRegionId) {
		this.mVkRegionId = vkRegionId;
	}

	public int getRouteNumber() {
		return mRouteNumber;
	}
  
	public void setRouteNumber(int routeNumber) {
		this.mRouteNumber = routeNumber;
	}

	public int getVersion() {
		return mVersion;
	}

	public void setVersion(int version) {
		this.mVersion = version;
	}

	public Calendar getLastUpdate() {
		return mLastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.mLastUpdate = lastUpdate;
	}
}
