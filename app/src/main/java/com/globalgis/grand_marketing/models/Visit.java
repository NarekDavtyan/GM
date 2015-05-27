package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class Visit 
{
	private int id = 0;
	private int vkId;
	private int userId;
	private String notes;
	private Calendar arrivalTime;
	private Calendar arrivalTimeUTC;
	private Calendar LeaveTime;
	private Calendar LeaveTimeUTC;
	private double x;
	private double y;
	private int version;
	private Calendar lastUpdate;
	
	public Visit(int vkId, int userId, String notes, Calendar arrivalTime, Calendar arrivalTimeUTC, Calendar leaveTime, Calendar leaveTimeUTC, double x, double y, int version, Calendar lastUpdate)
	{
		this.vkId = vkId;
		this.userId = userId;
		this.notes = notes;
		this.arrivalTime = arrivalTime;
		this.arrivalTimeUTC = arrivalTimeUTC;
		this.LeaveTime = leaveTime;
		this.LeaveTimeUTC = leaveTimeUTC;
		this.x = x;
		this.y = y;
		this.version = version;
		this.lastUpdate = lastUpdate;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Calendar getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Calendar arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Calendar getArrivalTimeUTC() {
		return arrivalTimeUTC;
	}

	public void setArrivalTimeUTC(Calendar arrivalTimeUTC) {
		this.arrivalTimeUTC = arrivalTimeUTC;
	}

	public Calendar getLeaveTime() {
		return LeaveTime;
	}

	public void setLeaveTime(Calendar leaveTime) {
		LeaveTime = leaveTime;
	}

	public Calendar getLeaveTimeUTC() {
		return LeaveTimeUTC;
	}

	public void setLeaveTimeUTC(Calendar leaveTimeUTC) {
		LeaveTimeUTC = leaveTimeUTC;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
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
