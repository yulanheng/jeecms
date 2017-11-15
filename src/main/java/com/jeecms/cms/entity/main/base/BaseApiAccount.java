package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_api_account table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_api_account"
 */

public abstract class BaseApiAccount  implements Serializable {

	public static String REF = "ApiAccount";
	public static String PROP_APP_ID = "appId";
	public static String PROP_APP_KEY = "appKey";
	public static String PROP_ID = "id";
	public static String PROP_DISABLED = "disabled";


	// constructors
	public BaseApiAccount () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseApiAccount (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseApiAccount (
		Integer id,
		String appId,
		String appKey,
		Boolean disabled) {

		this.setId(id);
		this.setAppId(appId);
		this.setAppKey(appKey);
		this.setDisabled(disabled);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String appId;
	private String appKey;
	private String aesKey;
	private String ivKey;
	private Boolean disabled;

	// collections
	private java.util.Set<com.jeecms.cms.entity.main.ApiRecord> callRecords;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="id"
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
	 * Return the value associated with the column: app_id
	 */
	public String getAppId () {
		return appId;
	}

	/**
	 * Set the value related to the column: app_id
	 * @param appId the app_id value
	 */
	public void setAppId (String appId) {
		this.appId = appId;
	}


	/**
	 * Return the value associated with the column: app_key
	 */
	public String getAppKey () {
		return appKey;
	}

	/**
	 * Set the value related to the column: app_key
	 * @param appKey the app_key value
	 */
	public void setAppKey (String appKey) {
		this.appKey = appKey;
	}

	public String getAesKey() {
		return aesKey;
	}

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}

	public String getIvKey() {
		return ivKey;
	}

	public void setIvKey(String ivKey) {
		this.ivKey = ivKey;
	}

	/**
	 * Return the value associated with the column: disabled
	 */
	public Boolean getDisabled () {
		return disabled;
	}

	/**
	 * Set the value related to the column: disabled
	 * @param disabled the disabled value
	 */
	public void setDisabled (Boolean disabled) {
		this.disabled = disabled;
	}


	/**
	 * Return the value associated with the column: callRecords
	 */
	public java.util.Set<com.jeecms.cms.entity.main.ApiRecord> getCallRecords () {
		return callRecords;
	}

	/**
	 * Set the value related to the column: callRecords
	 * @param callRecords the callRecords value
	 */
	public void setCallRecords (java.util.Set<com.jeecms.cms.entity.main.ApiRecord> callRecords) {
		this.callRecords = callRecords;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.ApiAccount)) return false;
		else {
			com.jeecms.cms.entity.main.ApiAccount apiAccount = (com.jeecms.cms.entity.main.ApiAccount) obj;
			if (null == this.getId() || null == apiAccount.getId()) return false;
			else return (this.getId().equals(apiAccount.getId()));
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