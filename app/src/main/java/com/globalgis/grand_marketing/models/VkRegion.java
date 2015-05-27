package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class VkRegion
{
	private int id = 0;
	private String vkregionName;
	private int avgBalBound;
	private int version;
	private int regionId;
	private int row;
	private Calendar last_update;
	
	public VkRegion(String vkRegionName, int avgBalBound, int regionId, int row, int version, Calendar last_update)
	{
		this.vkregionName = vkRegionName;
		this.avgBalBound = avgBalBound;
		this.regionId = regionId;
		this.version = version;
		this.last_update = last_update;
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
	 * @uml.property  name="vkregionName"
	 */
	public String getVkregionName() {
		return vkregionName;
	}

	/**
	 * @param vkregionName
	 * @uml.property  name="vkregionName"
	 */
	public void setVkregionName(String vkregionName) {
		this.vkregionName = vkregionName;
	}

	/**
	 * @return
	 * @uml.property  name="avgBalBound"
	 */
	public int getAvgBalBound() {
		return avgBalBound;
	}

	/**
	 * @param avgBalBound
	 * @uml.property  name="avgBalBound"
	 */
	public void setAvgBalBound(int avgBalBound) {
		this.avgBalBound = avgBalBound;
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
	 * @uml.property  name="last_update"
	 */
	public Calendar getLast_update() {
		return last_update;
	}

	/**
	 * @param last_update
	 * @uml.property  name="last_update"
	 */
	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

}
