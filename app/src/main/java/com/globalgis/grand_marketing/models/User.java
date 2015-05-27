package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class User {
	
	private String username;
	private String password;
	private int version = 0;
	private  Calendar last_update;
	private int id = 0;
	private String pocketId;
	
	public User(String username, String password, String pocketId, Calendar last_update, int version)
	{
		this.username = username;
		this.password = password;
		this.pocketId = pocketId;
		this.setLast_update(last_update);
		this.setVersion(version);
	}
	
	public User(String userName, String password, String pocketId)
	{
		this.username = userName;
		this.password = password;
		this.pocketId = pocketId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Calendar getLast_update() {
		return last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

	public String getPocketId() {
		return pocketId;
	}

	public void setPocketId(String pocketId) {
		this.pocketId = pocketId;
	}

}
