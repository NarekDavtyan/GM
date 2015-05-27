package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class VkStandsValues 
{
	private int id = 0;
	private int rowsCount;
	private int assortementCount;
	private int positionBal;
	private int standBal;
	private int rowProductBal;
	private int version;
	private Calendar lastUpdate;
	
	public VkStandsValues(int rowsCount, int assortementcount, int positionBal, int standBal,int rowProductBal, int version, Calendar lastUpdate)
	{
		this.rowsCount = rowsCount;
		this.assortementCount = assortementcount;
		this.positionBal = positionBal;
		this.setStandBal(standBal);
		this.setRowProductBal(rowProductBal);
		this.version = version;
		this.lastUpdate = lastUpdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRowsCount() {
		return rowsCount;
	}

	public void setRowsCount(int rowsCount) {
		this.rowsCount = rowsCount;
	}

	public int getAssortementCount() {
		return assortementCount;
	}

	public void setAssortementCount(int assortementCount) {
		this.assortementCount = assortementCount;
	}

	public int getPositionBal() {
		return positionBal;
	}

	public void setPositionBal(int positionBal) {
		this.positionBal = positionBal;
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

	public int getStandBal() {
		return standBal;
	}

	public void setStandBal(int standBal) {
		this.standBal = standBal;
	}
	
	public int getRowProductBal() {
		return rowProductBal;
	}

	public void setRowProductBal(int rowProductBal) {
		this.rowProductBal = rowProductBal;
	}


}
