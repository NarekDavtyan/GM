package com.globalgis.grand_marketing.models;

import java.util.Calendar;


public class Stands
{
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	private int row;
	/**
	 * @uml.property  name="standType"
	 */
	private String standType;
	/**
	 * @uml.property  name="minAssortment"
	 */
	private int minAssortment;
	/**
	 * @uml.property  name="maxAssortment"
	 */
	private int maxAssortment;
	/**
	 * @uml.property  name="rowCount"
	 */
	private int rowCount;
	/**
	 * @uml.property  name="version"
	 */
	private int version;
	/**
	 * @uml.property  name="lastUpdate"
	 */
	private Calendar lastUpdate;
	
	public Stands(int row, String type, int min, int max, int rowCount, int version, Calendar lastUpdate)
	{
		this.setRow(row);
		this.standType = type;
		this.minAssortment = min;
		this.maxAssortment = max;
		this.rowCount = rowCount;
		this.version = version;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return
	 * @uml.property  name="id"
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @uml.property  name="id"
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 * @uml.property  name="standType"
	 */
	public String getStandType() {
		return standType;
	}

	/**
	 * @param standType
	 * @uml.property  name="standType"
	 */
	public void setStandType(String standType) {
		this.standType = standType;
	}

	/**
	 * @return
	 * @uml.property  name="minAssortment"
	 */
	public int getMinAssortment() {
		return minAssortment;
	}

	/**
	 * @param minAssortment
	 * @uml.property  name="minAssortment"
	 */
	public void setMinAssortment(int minAssortment) {
		this.minAssortment = minAssortment;
	}

	/**
	 * @return
	 * @uml.property  name="maxAssortment"
	 */
	public int getMaxAssortment() {
		return maxAssortment;
	}

	/**
	 * @param maxAssortment
	 * @uml.property  name="maxAssortment"
	 */
	public void setMaxAssortment(int maxAssortment) {
		this.maxAssortment = maxAssortment;
	}

	/**
	 * @return
	 * @uml.property  name="rowCount"
	 */
	public int getRowCount() {
		return rowCount;
	}

	/**
	 * @param rowCount
	 * @uml.property  name="rowCount"
	 */
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	/**
	 * @return
	 * @uml.property  name="version"
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version
	 * @uml.property  name="version"
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return
	 * @uml.property  name="lastUpdate"
	 */
	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastupdate
	 * @uml.property  name="lastUpdate"
	 */
	public void setLastUpdate(Calendar lastupdate) {
		this.lastUpdate = lastupdate;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
