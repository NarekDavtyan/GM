package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class AdvertismentStock {
	
	
	/**
	 * @uml.property  name="advertismentId"
	 */
	private int advertismentId;
	/**
	 * @uml.property  name="stockCount"
	 */
	private int stockCount;
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	/**
	 * @uml.property  name="last_update"
	 */
	private  Calendar last_update;
	/**
	 * @uml.property  name="version"
	 */
	private int version = 0;
	
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
	
	public AdvertismentStock(int advertismentId, int stockCount, Calendar last_update, int version)
	{
		this.advertismentId = advertismentId;
		this.stockCount = stockCount;
		this.setLast_update(last_update);
		this.version = version;
	}

	/**
	 * @return
	 * @uml.property  name="advertismentId"
	 */
	public int getAdvertismentId() {
		return advertismentId;
	}

	/**
	 * @param advertismentId
	 * @uml.property  name="advertismentId"
	 */
	public void setAdvertismentId(int advertismentId) {
		this.advertismentId = advertismentId;
	}

	/**
	 * @return
	 * @uml.property  name="stockCount"
	 */
	public int getStockCount() {
		return stockCount;
	}

	/**
	 * @param stockCount
	 * @uml.property  name="stockCount"
	 */
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
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
	

}
