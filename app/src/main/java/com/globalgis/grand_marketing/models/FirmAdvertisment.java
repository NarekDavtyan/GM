package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class FirmAdvertisment 
{
	private int vkId;
	private int firmId;
	private int advertismentId;
	private int showCount;
	private Calendar lastGivenDate;
	private Calendar last_update;
	private int version = 0;
	private int id = 0;
	
	public FirmAdvertisment(int vkId, int firmId, int advertismentId, int showCount, Calendar lastGivenDate, Calendar lastUpdate, int version)
	{
		this.vkId = vkId;
		this.firmId = firmId;
		this.advertismentId = advertismentId;
		this.showCount = showCount;
		this.lastGivenDate = lastGivenDate;
		this.last_update = lastUpdate;
		this.setVersion(version);
	}
	
	public FirmAdvertisment(int vkId, int advertismentId, int showCount, Calendar lastUpdate, int version)
	{
		this.vkId = vkId;
		this.advertismentId = advertismentId;
		this.showCount = showCount;
		this.last_update = lastUpdate;
		this.setVersion(version);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getVkId() {
		return vkId;
	}

	public void setVkId(int vkId) {
		this.vkId = vkId;
	}

	public int getAdvertismentId() {
		return advertismentId;
	}

	public void setAdvertismentId(int advertismentId) {
		this.advertismentId = advertismentId;
	}

	public Calendar getLastUpdate() {
		return last_update;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.last_update = lastUpdate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public Calendar getLastGivenDate() {
		return lastGivenDate;
	}

	public void setLastGivenDate(Calendar lastGivenCount) {
		this.lastGivenDate = lastGivenCount;
	}

	public Calendar getLast_update() {
		return last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

	public int getFirmId() {
		return firmId;
	}

	public void setFirmId(int firmId) {
		this.firmId = firmId;
	}
}
