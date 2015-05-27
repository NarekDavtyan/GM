package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class Type {

	
	/**
	 * @uml.property  name="typeName"
	 */
	private String typeName;
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	/**
	 * @uml.property  name="last_update"
	 */
	private Calendar last_update;
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
	
	
	public Type(String typename, Calendar last_update, int version)
	{
		this.typeName = typename;
		this.version = version;
		this.last_update = last_update;
	}

	/**
	 * @return
	 * @uml.property  name="typeName"
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName
	 * @uml.property  name="typeName"
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String toString()
	{
		return "Name: " + this.typeName + " Version: " + this.version;
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
