package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class LocalityUnit {
	
	private int parentId;
	private String name;
	private int id = 0;
	private  Calendar last_update;
	private int version = 0;
	
	public LocalityUnit(int parentId, String name, Calendar last_update, int version)
	{
		this.parentId = parentId;
		this.name = name;
		this.version = version;
		this.last_update = last_update;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Calendar getLast_update() {
		return last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
