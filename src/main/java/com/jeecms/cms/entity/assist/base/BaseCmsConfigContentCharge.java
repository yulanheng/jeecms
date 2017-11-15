package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_config_content_charge table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_config_content_charge"
 */

public abstract class BaseCmsConfigContentCharge  implements Serializable {

	public static String REF = "CmsConfigContentCharge";
	public static String PROP_WEIXIN_PASSWORD = "weixinPassword";
	public static String PROP_SETTLEMENT_DATE = "settlementDate";
	public static String PROP_WEIXIN_APP_ID = "weixinAppId";
	public static String PROP_CHARGE_RATIO = "chargeRatio";
	public static String PROP_COMMISSION_MONTH = "commissionMonth";
	public static String PROP_ENABLE = "enable";
	public static String PROP_COMMISSION_DAY = "commissionDay";
	public static String PROP_COMMISSION_YEAR = "commissionYear";
	public static String PROP_ID = "id";
	public static String PROP_COMMISSION_TOTAL = "commissionTotal";
	public static String PROP_WEIXIN_ACCOUNT = "weixinAccount";


	// constructors
	public BaseCmsConfigContentCharge () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsConfigContentCharge (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsConfigContentCharge(Integer id, String weixinAppId, String weixinAccount,
			String weixinPassword, String alipayAppid, String alipayAccount, String alipayKey, Double chargeRatio,
			Double minDrawAmount) {
		super();
		this.id = id;
		this.weixinAppId = weixinAppId;
		this.weixinAccount = weixinAccount;
		this.weixinPassword = weixinPassword;
		this.alipayAccount = alipayAccount;
		this.alipayKey = alipayKey;
		this.chargeRatio = chargeRatio;
		this.minDrawAmount = minDrawAmount;
	}

	protected void initialize () {}






	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String weixinAppId;
	private String weixinSecret;
	private String weixinAccount;
	private String weixinPassword;
	private String alipayPartnerId;
	private String alipayAccount;
	private String alipayKey;

	private String alipayAppId;
	private String alipayPublicKey;
	private String alipayPrivateKey;
	
	private Double chargeRatio;
	private Double minDrawAmount;
	private Double commissionTotal;
	private Double commissionYear;
	private Double commissionMonth;
	private Double commissionDay;
	private java.util.Date lastBuyTime;
	private String payTransferPassword;
	private String transferApiPassword;
	private Double rewardMin;
	private Double rewardMax;
	private Boolean rewardPattern;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="config_content_id"
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
	 * Return the value associated with the column: account_weixin_appid
	 */
	public String getWeixinAppId () {
		return weixinAppId;
	}

	/**
	 * Set the value related to the column: account_weixin_appid
	 * @param weixinAppId the account_weixin_appid value
	 */
	public void setWeixinAppId (String weixinAppId) {
		this.weixinAppId = weixinAppId;
	}

	public String getWeixinSecret() {
		return weixinSecret;
	}

	public void setWeixinSecret(String weixinSecret) {
		this.weixinSecret = weixinSecret;
	}

	/**
	 * Return the value associated with the column: weixin_account
	 */
	public String getWeixinAccount () {
		return weixinAccount;
	}

	/**
	 * Set the value related to the column: weixin_account
	 * @param weixinAccount the weixin_account value
	 */
	public void setWeixinAccount (String weixinAccount) {
		this.weixinAccount = weixinAccount;
	}


	/**
	 * Return the value associated with the column: weixin_password
	 */
	public String getWeixinPassword () {
		return weixinPassword;
	}

	/**
	 * Set the value related to the column: weixin_password
	 * @param weixinPassword the weixin_password value
	 */
	public void setWeixinPassword (String weixinPassword) {
		this.weixinPassword = weixinPassword;
	}


	/**
	 * Return the value associated with the column: charge_ratio
	 */
	public Double getChargeRatio () {
		return chargeRatio;
	}

	/**
	 * Set the value related to the column: charge_ratio
	 * @param chargeRatio the charge_ratio value
	 */
	public void setChargeRatio (Double chargeRatio) {
		this.chargeRatio = chargeRatio;
	}
	
	public String getAlipayAccount() {
		return alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipayKey() {
		return alipayKey;
	}

	public void setAlipayKey(String alipayKey) {
		this.alipayKey = alipayKey;
	}
	
	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}

	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}

	public String getAlipayPartnerId() {
		return alipayPartnerId;
	}

	public void setAlipayPartnerId(String alipayPartnerId) {
		this.alipayPartnerId = alipayPartnerId;
	}

	public String getAlipayAppId() {
		return alipayAppId;
	}

	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getAlipayPrivateKey() {
		return alipayPrivateKey;
	}

	public void setAlipayPrivateKey(String alipayPrivateKey) {
		this.alipayPrivateKey = alipayPrivateKey;
	}

	public Double getMinDrawAmount() {
		return minDrawAmount;
	}

	public void setMinDrawAmount(Double minDrawAmount) {
		this.minDrawAmount = minDrawAmount;
	}

	/**
	 * Return the value associated with the column: commission_total
	 */
	public Double getCommissionTotal () {
		return commissionTotal;
	}

	/**
	 * Set the value related to the column: commission_total
	 * @param commissionTotal the commission_total value
	 */
	public void setCommissionTotal (Double commissionTotal) {
		this.commissionTotal = commissionTotal;
	}


	/**
	 * Return the value associated with the column: commission_year
	 */
	public Double getCommissionYear () {
		return commissionYear;
	}

	/**
	 * Set the value related to the column: commission_year
	 * @param commissionYear the commission_year value
	 */
	public void setCommissionYear (Double commissionYear) {
		this.commissionYear = commissionYear;
	}


	/**
	 * Return the value associated with the column: commission_month
	 */
	public Double getCommissionMonth () {
		return commissionMonth;
	}

	/**
	 * Set the value related to the column: commission_month
	 * @param commissionMonth the commission_month value
	 */
	public void setCommissionMonth (Double commissionMonth) {
		this.commissionMonth = commissionMonth;
	}


	/**
	 * Return the value associated with the column: commission_day
	 */
	public Double getCommissionDay () {
		return commissionDay;
	}

	/**
	 * Set the value related to the column: commission_day
	 * @param commissionDay the commission_day value
	 */
	public void setCommissionDay (Double commissionDay) {
		this.commissionDay = commissionDay;
	}

	public java.util.Date getLastBuyTime() {
		return lastBuyTime;
	}

	public void setLastBuyTime(java.util.Date lastBuyTime) {
		this.lastBuyTime = lastBuyTime;
	}

	public String getPayTransferPassword() {
		return payTransferPassword;
	}

	public void setPayTransferPassword(String payTransferPassword) {
		this.payTransferPassword = payTransferPassword;
	}

	public String getTransferApiPassword() {
		return transferApiPassword;
	}

	public void setTransferApiPassword(String transferApiPassword) {
		this.transferApiPassword = transferApiPassword;
	}

	public Double getRewardMin() {
		return rewardMin;
	}

	public void setRewardMin(Double rewardMin) {
		this.rewardMin = rewardMin;
	}

	public Double getRewardMax() {
		return rewardMax;
	}

	public void setRewardMax(Double rewardMax) {
		this.rewardMax = rewardMax;
	}

	public Boolean getRewardPattern() {
		return rewardPattern;
	}

	public void setRewardPattern(Boolean rewardPattern) {
		this.rewardPattern = rewardPattern;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsConfigContentCharge)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsConfigContentCharge cmsConfigContentCharge = (com.jeecms.cms.entity.assist.CmsConfigContentCharge) obj;
			if (null == this.getId() || null == cmsConfigContentCharge.getId()) return false;
			else return (this.getId().equals(cmsConfigContentCharge.getId()));
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