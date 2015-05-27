package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class BalSystem 
{
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	/**
	 * @uml.property  name="stand_id"
	 */
	private int stand_id;
	/**
	 * @uml.property  name="rowCount"
	 */
	private int rowCount;
	private int minAssortement;
	/**
	 * @uml.property  name="bal"
	 */
	private int bal;
	/**
	 * @uml.property  name="version"
	 */
	private int version;
	/**
	 * @uml.property  name="last_update"
	 */
	private Calendar last_update;
	
	public BalSystem(int standId, int rowCount, int bal, int minAssortement, int version, Calendar lastUpdate )
	{
		this.stand_id = standId;
		this.rowCount = rowCount;
		this.bal = bal;
		this.setMinAssortement(minAssortement);
		this.version = version;
		this.last_update = lastUpdate;
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
	 * @uml.property  name="stand_id"
	 */
	public int getStand_id() {
		return stand_id;
	}

	/**
	 * @param stand_id
	 * @uml.property  name="stand_id"
	 */
	public void setStand_id(int stand_id) {
		this.stand_id = stand_id;
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
	 * @uml.property  name="bal"
	 */
	public int getBal() {
		return bal;
	}

	/**
	 * @param bal
	 * @uml.property  name="bal"
	 */
	public void setBal(int bal) {
		this.bal = bal;
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

	public int getMinAssortement() {
		return minAssortement;
	}

	public void setMinAssortement(int minAssortement) {
		this.minAssortement = minAssortement;
	}
}
