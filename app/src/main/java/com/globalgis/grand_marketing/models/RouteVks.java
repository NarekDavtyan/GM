package com.globalgis.grand_marketing.models;
import java.util.Calendar;

public class RouteVks {
	private int id = 0;
	private int RouteId ;
	private int currentRouteNumber;
	
	private int vkCode;
	private Calendar lastUpdate;
	private int version;
	
	public RouteVks(int routeId,int currentRouteNumber,int vkCode,int version, Calendar lastUpdate)
	{
		this.RouteId =routeId;
		this.currentRouteNumber = currentRouteNumber;
		this.vkCode = vkCode;
		this.version = version;
		this.lastUpdate = lastUpdate;
		
	}
	public int getId() {
		return id;
	}
	public int getCurrentRouteNumber(){
	    	return currentRouteNumber;
	}
	public int getVkCode() {
		return vkCode;
	}
	public int getVersion() {
		return version;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}
	public int getRouteId()
	{
		return RouteId;
	
	}
	
}
