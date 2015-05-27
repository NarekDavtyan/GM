package com.globalgis.grand_marketing.models;

public class JSONData 
{
	private int type;
	private String jsonData;
	private int userId;
	private int id = 0;
	private User user;
	
	public JSONData(int id, int type, String jsonData, int userId, User user)
	{
		this.id = id;
		this.type = type;
		this.jsonData = jsonData;
		this.userId = userId;
		this.setUser(user);
	}
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
