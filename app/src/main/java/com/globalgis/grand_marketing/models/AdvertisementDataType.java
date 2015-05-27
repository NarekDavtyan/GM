package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class AdvertisementDataType {
	
	private String name;
	private int id = 0;
    private int row;
    private int version;
    private Calendar lastUpdate;

	public AdvertisementDataType(int row, String typename, Calendar lastUpdate, int version) {
		this.name = typename;
		this.row = row;
		this.lastUpdate = lastUpdate;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

}
