package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class UserRegion 
{
	private int id = 0;
	private int userId;
	private int vkRegionId;
	private int version;
	private Calendar lastUpdate;
	
	public UserRegion(int userId, int vkRegionId, int version, Calendar lastUpdate)
	{
		this.userId =userId;
		this.vkRegionId = vkRegionId;
		this.version = version;
		this.lastUpdate = lastUpdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVkRegionId() {
		return vkRegionId;
	}

	public void setVkRegionId(int vkRegionId) {
		this.vkRegionId = vkRegionId;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
