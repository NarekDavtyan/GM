package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class VkClass
{
	/**
	 * @uml.property  name="id"
	 */
	private int id = 0;
	/**
	 * @uml.property  name="vkClassName"
	 */
	private String vkClassName;
	/**
	 * @uml.property  name="coefficient"
	 */
	private int coefficient;
	/**
	 * @uml.property  name="version"
	 */
	private int version;
	/**
	 * @uml.property  name="last_update"
	 */
	private Calendar last_update;
	
	public VkClass(String vkClassName, int coefficient, int version, Calendar last_update)
	{
		this.vkClassName = vkClassName;
		this.coefficient = coefficient;
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
	 * @uml.property  name="vkClassName"
	 */
	public String getVkClassName() {
		return vkClassName;
	}

	/**
	 * @param vkClassName
	 * @uml.property  name="vkClassName"
	 */
	public void setVkClassName(String vkClassName) {
		this.vkClassName = vkClassName;
	}

	/**
	 * @return
	 * @uml.property  name="coefficient"
	 */
	public int getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient
	 * @uml.property  name="coefficient"
	 */
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
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
