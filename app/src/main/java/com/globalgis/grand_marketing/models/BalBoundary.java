package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class BalBoundary 
{
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	/**
	 * @uml.property  name="name"
	 */
	private String name;
	/**
	 * @uml.property  name="boundaryCode"
	 */
	private int boundaryCode;
	/**
	 * @uml.property  name="value"
	 */
	private float value;
	/**
	 * @uml.property  name="version"
	 */
	private int version = 0;
	/**
	 * @uml.property  name="last_update"
	 */
	private Calendar last_update;
	
	public BalBoundary(String name, int boundaryCode,  float value, int version, Calendar last_update)
	{
		this.name = name;
		this.setBoundaryCode(boundaryCode);
		this.value = value;
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
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 * @uml.property  name="value"
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value
	 * @uml.property  name="value"
	 */
	public void setValue(float value) {
		this.value = value;
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

	/**
	 * @return
	 * @uml.property  name="boundaryCode"
	 */
	public int getBoundaryCode() {
		return boundaryCode;
	}

	/**
	 * @param boundaryCode
	 * @uml.property  name="boundaryCode"
	 */
	public void setBoundaryCode(int boundaryCode) {
		this.boundaryCode = boundaryCode;
	}

}
