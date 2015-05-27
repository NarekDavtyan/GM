package com.globalgis.grand_marketing.models;

public enum BalBoundariesEnum 
{
	RIVAL_BAL_BOUNDARY(0),
	LABEL_BAL_BOUNDARY(1),
	VVT_BAL_BOUNDARY(2),
	PRODUCT_BAL_BOUNDARY(3);
	
	private int value;
	private BalBoundariesEnum(int value)
	{
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
