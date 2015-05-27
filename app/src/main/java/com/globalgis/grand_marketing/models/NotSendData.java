package com.globalgis.grand_marketing.models;



public class NotSendData {
	private int id;
	private String table_Name;
	private int table_Id;
	private String protocolType;
	private int userId;
	private User user;
	public void setTableName(String table_Name) {
		this.table_Name = table_Name;
	} 
	
	public void setTableId(int table_Id) {
		this.table_Id = table_Id;
	} 
	
	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	} 
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * @param user
	 * @uml.property  name="user"
	 */
	
	public User getUser() {
		return user;
	}

	public String getTableName()
	{
		return this.table_Name;
	}
	public String getProtocolType()
	{
		return this.protocolType;
	}
	public int getTableId()
	{
		return this.table_Id;
	}
	public int getUserId() {
		return userId;
	}
	
	public NotSendData(String table_Name,int table_Id,String protocolType,int userId, User user)
	{
		this.table_Name=table_Name;
		this.table_Id=table_Id;
		this.protocolType=protocolType;
		this.userId = userId;
		this.setUser(user);
	}
}
