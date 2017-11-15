package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content_charge table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content_charge"
 */

public abstract class BaseContentCharge  implements Serializable {

	public static String REF = "CmsContentCharge";
	public static String PROP_MONTH_AMOUNT = "monthAmount";
	public static String PROP_DAY_AMOUNT = "dayAmount";
	public static String PROP_CONTENT = "content";
	public static String PROP_CHARGE = "charge";
	public static String PROP_YEAR_AMOUNT = "yearAmount";
	public static String PROP_TOTAL_AMOUNT = "totalAmount";
	public static String PROP_ID = "id";
	public static String PROP_CHARGE_AMOUNT = "chargeAmount";


	// constructors
	public BaseContentCharge () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseContentCharge (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentCharge (
		Integer id,
		Double chargeAmount,
		Double totalAmount,
		Double yearAmount,
		Double monthAmount,
		Double dayAmount) {

		this.setId(id);
		this.setChargeAmount(chargeAmount);
		this.setTotalAmount(totalAmount);
		this.setYearAmount(yearAmount);
		this.setMonthAmount(monthAmount);
		this.setDayAmount(dayAmount);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Double chargeAmount;
	private Double totalAmount;
	private Double yearAmount;
	private Double monthAmount;
	private Double dayAmount;
	private java.util.Date lastBuyTime;
	private Short chargeReward;
	
	private Double rewardRandomMin;
	private Double rewardRandomMax;
	private Boolean rewardPattern;

	// one to one
	private com.jeecms.cms.entity.main.Content content;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="content_id"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: charge_amount
	 */
	public Double getChargeAmount () {
		return chargeAmount;
	}

	/**
	 * Set the value related to the column: charge_amount
	 * @param chargeAmount the charge_amount value
	 */
	public void setChargeAmount (Double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}


	/**
	 * Return the value associated with the column: total_amount
	 */
	public Double getTotalAmount () {
		return totalAmount;
	}

	/**
	 * Set the value related to the column: total_amount
	 * @param totalAmount the total_amount value
	 */
	public void setTotalAmount (Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	/**
	 * Return the value associated with the column: year_amount
	 */
	public Double getYearAmount () {
		return yearAmount;
	}

	/**
	 * Set the value related to the column: year_amount
	 * @param yearAmount the year_amount value
	 */
	public void setYearAmount (Double yearAmount) {
		this.yearAmount = yearAmount;
	}


	/**
	 * Return the value associated with the column: month_amount
	 */
	public Double getMonthAmount () {
		return monthAmount;
	}

	/**
	 * Set the value related to the column: month_amount
	 * @param monthAmount the month_amount value
	 */
	public void setMonthAmount (Double monthAmount) {
		this.monthAmount = monthAmount;
	}


	/**
	 * Return the value associated with the column: day_amount
	 */
	public Double getDayAmount () {
		return dayAmount;
	}

	/**
	 * Set the value related to the column: day_amount
	 * @param dayAmount the day_amount value
	 */
	public void setDayAmount (Double dayAmount) {
		this.dayAmount = dayAmount;
	}


	public java.util.Date getLastBuyTime() {
		return lastBuyTime;
	}

	public void setLastBuyTime(java.util.Date lastBuyTime) {
		this.lastBuyTime = lastBuyTime;
	}

	public Short getChargeReward() {
		return chargeReward;
	}

	public void setChargeReward(Short chargeReward) {
		this.chargeReward = chargeReward;
	}

	public Double getRewardRandomMin() {
		return rewardRandomMin;
	}

	public void setRewardRandomMin(Double rewardRandomMin) {
		this.rewardRandomMin = rewardRandomMin;
	}

	public Double getRewardRandomMax() {
		return rewardRandomMax;
	}

	public void setRewardRandomMax(Double rewardRandomMax) {
		this.rewardRandomMax = rewardRandomMax;
	}

	public Boolean getRewardPattern() {
		return rewardPattern;
	}

	public void setRewardPattern(Boolean rewardPattern) {
		this.rewardPattern = rewardPattern;
	}

	/**
	 * Return the value associated with the column: content
	 */
	public com.jeecms.cms.entity.main.Content getContent () {
		return content;
	}

	/**
	 * Set the value related to the column: content
	 * @param content the content value
	 */
	public void setContent (com.jeecms.cms.entity.main.Content content) {
		this.content = content;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.ContentCharge)) return false;
		else {
			com.jeecms.cms.entity.main.ContentCharge cmsContentCharge = (com.jeecms.cms.entity.main.ContentCharge) obj;
			if (null == this.getId() || null == cmsContentCharge.getId()) return false;
			else return (this.getId().equals(cmsContentCharge.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}