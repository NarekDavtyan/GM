package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class StandOrder 
{
	private int id  = 0;
	private int stand_id;
	private int vk_id;
	private int count;
	private Calendar orderDate;
	private Calendar orderDoneDate = null;
	private int version;
	private Calendar lastUpdate;
	
	public StandOrder(int stand_id, int count, int vkId, Calendar orderDate, Calendar orderDoneDate, int version , Calendar lastUpdate)
	{
		this.stand_id = stand_id;
		this.count = count;
		this.vk_id = vkId;
		this.orderDate = orderDate;
		this.orderDoneDate = orderDoneDate;
		this.version = version;
		this.lastUpdate = lastUpdate;
	}
	
	public StandOrder(int stand_id, int count, int vkId, Calendar orderDate, int version, Calendar lastUpdate)
	{
		this.stand_id = stand_id;
		this.count = count;
		this.vk_id = vkId;
		this.orderDate = orderDate;
		this.version = version;
		this.lastUpdate = lastUpdate;
	}
	
	public boolean isOrderDone()
	{
		return orderDate.before(orderDoneDate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStand_id() {
		return stand_id;
	}

	public void setStand_id(int stand_id) {
		this.stand_id = stand_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Calendar getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Calendar orderDate) {
		this.orderDate = orderDate;
	}

	public Calendar getOrderDoneDate() {
		return orderDoneDate;
	}

	public void setOrderDoneDate(Calendar orderDoneDate) {
		this.orderDoneDate = orderDoneDate;
	}

	public int getVk_id() {
		return vk_id;
	}

	public void setVk_id(int vk_id) {
		this.vk_id = vk_id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
