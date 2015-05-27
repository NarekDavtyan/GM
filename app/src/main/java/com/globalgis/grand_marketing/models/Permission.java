package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class Permission {
	
	/**
	 * @uml.property  name="tableName"
	 */
	private String tableName;
	/**
	 * @uml.property  name="columnName"
	 */
	private String columnName;
	/**
	 * @uml.property  name="userType"
	 */
	private String userType;
	/**
	 * @uml.property  name="addChangeColumn"
	 */
	private boolean addChangeColumn;
	/**
	 * @uml.property  name="deleteColumn"
	 */
	private boolean deleteColumn;
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
	
	
	public Permission(String tableName, String columnName, String userType, boolean addChangeColumn, boolean deleteColumn, Calendar last_update, int version)
	{
		this.tableName = tableName;
		this.columnName = columnName;
		this.userType = userType;
		this.addChangeColumn = addChangeColumn;
		this.deleteColumn = deleteColumn;
		this.setLast_update(last_update);
		this.setVersion(version);
	}

	/**
	 * @return
	 * @uml.property  name="tableName"
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName
	 * @uml.property  name="tableName"
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return
	 * @uml.property  name="columnName"
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * @param columnName
	 * @uml.property  name="columnName"
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * @return
	 * @uml.property  name="userType"
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType
	 * @uml.property  name="userType"
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return
	 * @uml.property  name="addChangeColumn"
	 */
	public boolean isAddChangeColumn() {
		return addChangeColumn;
	}

	/**
	 * @param addChangeColumn
	 * @uml.property  name="addChangeColumn"
	 */
	public void setAddChangeColumn(boolean addChangeColumn) {
		this.addChangeColumn = addChangeColumn;
	}

	/**
	 * @return
	 * @uml.property  name="deleteColumn"
	 */
	public boolean isDeleteColumn() {
		return deleteColumn;
	}

	/**
	 * @param deleteColumn
	 * @uml.property  name="deleteColumn"
	 */
	public void setDeleteColumn(boolean deleteColumn) {
		this.deleteColumn = deleteColumn;
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
