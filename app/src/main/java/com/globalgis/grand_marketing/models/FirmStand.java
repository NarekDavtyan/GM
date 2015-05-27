package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class FirmStand 
{
	private int id = 0;
	private int vkId;
	private int firmId;
	private int standId;
	private int count;
	private int version;
	private Calendar lastUpdate;
	
	public FirmStand(int vkId, int firmId, int standId, int count, int version, Calendar lastUpdate)
	{
		this.vkId = vkId;
		this.firmId = firmId;
		this.standId = standId;
		this.count = count;
		this.version = version;
		this.lastUpdate = lastUpdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFirmId() {
		return firmId;
	}

	public void setFirmId(int firmId) {
		this.firmId = firmId;
	}

	public int getStandId() {
		return standId;
	}

	public void setStandId(int standId) {
		this.standId = standId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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

	public int getVkId() {
		return vkId;
	}

	public void setVkId(int vkId) {
		this.vkId = vkId;
	}
}
