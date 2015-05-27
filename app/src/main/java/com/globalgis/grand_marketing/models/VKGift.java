package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class VKGift {

	private int vkId;
	private int giftId;
	private int count;
	private Calendar givenDate;
	private Calendar lastUpdate;
	private int version = 0;
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
	
	public VKGift(int vkId, int giftId, int count, Calendar givenDate, Calendar lastUpdate, int version)
	{
		this.vkId = vkId;
		this.giftId = giftId;
		this.count = count;
		this.givenDate = givenDate;
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
	 * @uml.property  name="giftId"
	 */
	public int getGiftId() {
		return giftId;
	}

	/**
	 * @param giftId
	 * @uml.property  name="giftId"
	 */
	public void setGiftId(int giftId) {
		this.giftId = giftId;
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

	public Calendar getGivenDate() {
		return givenDate;
	}

	public void setGivenDate(Calendar givenDate) {
		this.givenDate = givenDate;
	}
}
