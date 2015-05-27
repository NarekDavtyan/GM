package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class VKStand {
	
	/**
	 * @uml.property  name="vkId"
	 */
	private int vkId;
	/**
	 * @uml.property  name="standId"
	 */
	private int standId;
	/**
	 * @uml.property  name="count"
	 */
	private int count;
	private int rowCount;
	private int vkStandValueId;
	/**
	 * @uml.property  name="lastUpdate"
	 */
	private Calendar lastUpdate;
	/**
	 * @uml.property  name="version"
	 */
	private int version = 0;
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	
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
	
	public VKStand(int vkId, int standId, int count, int vkStandValueId, Calendar lastUpdate, int version)
	{
		this.vkId = vkId;
		this.standId = standId;
		this.count = count;
		this.vkStandValueId = vkStandValueId;
		this.lastUpdate = lastUpdate;
		this.version = version;
	}

	public VKStand(int vkId, int standId, int count, int rowCount, int vkStandValueId, Calendar lastUpdate, int version)
	{
		this.vkId = vkId;
		this.standId = standId;
		this.count = count;
		this.rowCount = rowCount;
		this.vkStandValueId = vkStandValueId;
		this.lastUpdate = lastUpdate;
		this.version = version;
	}
	/**
	 * @return
	 * @uml.property  name="vkId"
	 */
	public int getVkId() {
		return vkId;
	}

	/**
	 * @param vkId
	 * @uml.property  name="vkId"
	 */
	public void setVkId(int vkId) {
		this.vkId = vkId;
	}

	/**
	 * @return
	 * @uml.property  name="count"
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 * @uml.property  name="count"
	 */
	public void setCount(int count) {
		this.count = count;
	}
	public int getRowCount() {
		return rowCount;
	}

	/**
	 * @param count
	 * @uml.property  name="count"
	 */
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	/**
	 * @return
	 * @uml.property  name="actualRowCount"
	 */
	public int getVkStandValueId() {
		return vkStandValueId;
	}

	/**
	 * @param actualRowCount
	 * @uml.property  name="actualRowCount"
	 */
	public void setVkStandValueId(int vkStandValueId) {
		this.vkStandValueId = vkStandValueId;
	}

	/**
	 * @return
	 * @uml.property  name="lastUpdate"
	 */
	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate
	 * @uml.property  name="lastUpdate"
	 */
	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return
	 * @uml.property  name="standId"
	 */
	public int getStandId() {
		return standId;
	}

	/**
	 * @param standId
	 * @uml.property  name="standId"
	 */
	public void setStandId(int standId) {
		this.standId = standId;
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

}
