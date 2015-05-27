package com.globalgis.grand_marketing.models;

import java.util.Calendar;

public class GGIMData 
{
	private int id = 0;
	private int vkId;
	/**
	 * @uml.property  name="showedProductsCount"
	 */
	private int ShowedProductsCount;
	/**
	 * @uml.property  name="rivalsShowedProductsCount"
	 */
	private int RivalsShowedProductsCount;
	/**
	 * @uml.property  name="advertismentBal"
	 */
	private int AdvertismentBal;
	/**
	 * @uml.property  name="labelsCount"
	 */
	private int LabelsCount;
	/**
	 * @uml.property  name="arrangementBal"
	 */
	private int arrangementBal;
	/**
	 * @uml.property  name="positionBal"
	 */
	private int PositionBal;
	/**
	 * @uml.property  name="lusterBal"
	 */
	private int LusterBal;
	/**
	 * @uml.property  name="vvtCount"
	 */
	private int VvtCount;
	/**
	 * @uml.property  name="newProductsBal"
	 */
	private int NewProductsBal;
	/**
	 * @uml.property  name="newsBal"
	 */
	private int NewsBal;
	/**
	 * @uml.property  name="decreasesBal"
	 */
	private int DecreasesBal;
	private int totalBal;
	/**
	 * @uml.property  name="last_update"
	 */
	private  Calendar last_update;
	/**
	 * @uml.property  name="version"
	 */
	private int version = 0;
	
	private int Gt_Itm_bal;
	private int Forced_Price;
	
	public GGIMData(int vkId, int ShowedProductsCount, int RivalsShowedProductsCount, int AdvertismentBal, int LabelsCount, int arrangementBal, int PositionBal,
			int LusterBal, int VvtCount, int NewProductsBal, int NewsBal, int DecreasesBal, int coefficient,  Calendar last_update, int version)
	{
		this.vkId = vkId;
		this.ShowedProductsCount = ShowedProductsCount;
		this.RivalsShowedProductsCount = RivalsShowedProductsCount;
		this.AdvertismentBal = AdvertismentBal;
		this.LabelsCount = LabelsCount;
		this.arrangementBal = arrangementBal;
		this.PositionBal = PositionBal;
		this.LusterBal = LusterBal;
		this.VvtCount = VvtCount;
		this.NewProductsBal = NewProductsBal;
		this.NewsBal = NewsBal;
		this.DecreasesBal = DecreasesBal;
		this.totalBal = coefficient * (AdvertismentBal + (int)arrangementBal + PositionBal + LusterBal + NewProductsBal + NewsBal - DecreasesBal);
		this.last_update = last_update;
		this.version = version;
	}
	
	public GGIMData(int vkId, int ShowedProductsCount, int RivalsShowedProductsCount, int AdvertismentBal, int LabelsCount, int arrangementBal, int PositionBal,
			int LusterBal, int VvtCount, int NewProductsBal, int NewsBal, int DecreasesBal, int coefficient,int gt_Itm_bal,int forced_Price,  Calendar last_update, int version)
	{
		this.vkId = vkId;
		this.ShowedProductsCount = ShowedProductsCount;
		this.RivalsShowedProductsCount = RivalsShowedProductsCount;
		this.AdvertismentBal = AdvertismentBal;
		this.LabelsCount = LabelsCount;
		this.arrangementBal = arrangementBal;
		this.PositionBal = PositionBal;
		this.LusterBal = LusterBal;
		this.VvtCount = VvtCount;
		this.NewProductsBal = NewProductsBal;
		this.NewsBal = NewsBal;
		this.DecreasesBal = DecreasesBal;
		this.Gt_Itm_bal=gt_Itm_bal;
		this.Forced_Price=forced_Price;
		this.totalBal = coefficient * (AdvertismentBal + (int)arrangementBal + PositionBal + LusterBal + NewProductsBal + NewsBal+gt_Itm_bal+forced_Price - DecreasesBal);
		this.last_update = last_update;
		this.version = version;
	}
	
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
	 * @uml.property  name="vkId"
	 */
	public int getVkId() {
		return vkId;
	}

	/**
	 * @param vkId
	 * @uml.property  name="vkId"
	 */
	public void setVkId(int vkId) {
		this.vkId = vkId;
	}

	/**
	 * @return
	 * @uml.property  name="showedProductsCount"
	 */
	public int getShowedProductsCount() {
		return ShowedProductsCount;
	}
	/**
	 * @return
	 * @uml.property  name="showedProductsCount"
	 */
	public int getGtItmBal() {
		return Gt_Itm_bal;
	}
	
	public int getForcedPrice() {
		return Forced_Price;
	}

	/**
	 * @param showedProductsCount
	 * @uml.property  name="showedProductsCount"
	 */
	public void setShowedProductsCount(int showedProductsCount) {
		ShowedProductsCount = showedProductsCount;
	}

	/**
	 * @return
	 * @uml.property  name="rivalsShowedProductsCount"
	 */
	public int getRivalsShowedProductsCount() {
		return RivalsShowedProductsCount;
	}

	/**
	 * @param rivalsShowedProductsCount
	 * @uml.property  name="rivalsShowedProductsCount"
	 */
	public void setRivalsShowedProductsCount(int rivalsShowedProductsCount) {
		RivalsShowedProductsCount = rivalsShowedProductsCount;
	}

	/**
	 * @return
	 * @uml.property  name="advertismentBal"
	 */
	public int getAdvertismentBal() {
		return AdvertismentBal;
	}

	/**
	 * @param advertismentBal
	 * @uml.property  name="advertismentBal"
	 */
	public void setAdvertismentBal(int advertismentBal) {
		AdvertismentBal = advertismentBal;
	}

	/**
	 * @return
	 * @uml.property  name="labelsCount"
	 */
	public int getLabelsCount() {
		return LabelsCount;
	}

	/**
	 * @param labelsCount
	 * @uml.property  name="labelsCount"
	 */
	public void setLabelsCount(int labelsCount) {
		LabelsCount = labelsCount;
	}

	/**
	 * @return
	 * @uml.property  name="positionBal"
	 */
	public int getPositionBal() {
		return PositionBal;
	}

	/**
	 * @param positionBal
	 * @uml.property  name="positionBal"
	 */
	public void setPositionBal(int positionBal) {
		PositionBal = positionBal;
	}

	/**
	 * @return
	 * @uml.property  name="lusterBal"
	 */
	public int getLusterBal() {
		return LusterBal;
	}

	/**
	 * @param lusterBal
	 * @uml.property  name="lusterBal"
	 */
	public void setLusterBal(int lusterBal) {
		LusterBal = lusterBal;
	}

	/**
	 * @return
	 * @uml.property  name="vvtCount"
	 */
	public int getVvtCount() {
		return VvtCount;
	}

	/**
	 * @param vvtCount
	 * @uml.property  name="vvtCount"
	 */
	public void setVvtCount(int vvtCount) {
		VvtCount = vvtCount;
	}

	/**
	 * @return
	 * @uml.property  name="newProductsBal"
	 */
	public int getNewProductsBal() {
		return NewProductsBal;
	}

	/**
	 * @param newProductsBal
	 * @uml.property  name="newProductsBal"
	 */
	public void setNewProductsBal(int newProductsBal) {
		NewProductsBal = newProductsBal;
	}

	/**
	 * @return
	 * @uml.property  name="newsBal"
	 */
	public int getNewsBal() {
		return NewsBal;
	}

	/**
	 * @param newsBal
	 * @uml.property  name="newsBal"
	 */
	public void setNewsBal(int newsBal) {
		NewsBal = newsBal;
	}

	/**
	 * @return
	 * @uml.property  name="decreasesBal"
	 */
	public int getDecreasesBal() {
		return DecreasesBal;
	}

	/**
	 * @param decreasesBal
	 * @uml.property  name="decreasesBal"
	 */
	public void setDecreasesBal(int decreasesBal) {
		DecreasesBal = decreasesBal;
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
	 * @uml.property  name="arrangementBal"
	 */
	public int getArrangementBal() {
		return arrangementBal;
	}

	/**
	 * @param arrangementBal
	 * @uml.property  name="arrangementBal"
	 */
	public void setArrangementBal(int arrangementBal) {
		this.arrangementBal = arrangementBal;
	}

	/**
	 * @return
	 * @uml.property  name="totalBal"
	 */
	public int getTotalBal() {
		return totalBal;
	}

	/**
	 * @param totalBal
	 * @uml.property  name="totalBal"
	 */
	public void setTotalBal(int totalBal) {
		this.totalBal = totalBal;
	}


}
