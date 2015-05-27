package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class PauseBreak 
{
	private int id = 0;
	private int userId;
	private Calendar startDate;
	private Calendar endDate;
	private int version;
	private Calendar lastUpdate;
	
	public PauseBreak(int userId, Calendar startDate, Calendar endDate, int version, Calendar lastUpdate)
	{
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
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

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
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
