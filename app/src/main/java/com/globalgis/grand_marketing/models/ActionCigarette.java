package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class ActionCigarette 
{
	private int id = 0;
	private int actionId;
	private int cigaretteId;
	private int version;
	private Calendar lastUpdate;
	
	public ActionCigarette(int actionId, int cigaretteId, int version, Calendar lastupdate)
	{
		this.actionId = actionId;
		this.cigaretteId = cigaretteId;
		this.version = version;
		this.lastUpdate = lastupdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getActionId() {
		return actionId;
	}
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	public int getCigaretteId() {
		return cigaretteId;
	}
	public void setCigaretteId(int cigaretteId) {
		this.cigaretteId = cigaretteId;
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
