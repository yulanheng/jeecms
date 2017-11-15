package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_webservice table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_webservice"
 */

public abstract class BaseCmsWebservice  implements Serializable {

	public static String REF = "CmsWebservice";
	public static String PROP_OPERATE = "operate";
	public static String PROP_TYPE = "type";
	public static String PROP_ADDRESS = "address";
	public static String PROP_TARGET_NAMESPACE = "targetNamespace";
	public static String PROP_ID = "id";
	public static String PROP_SUCCESS_RESULT = "successResult";


	// constructors
	public BaseCmsWebservice () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsWebservice (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsWebservice (
		Integer id,
		String address) {

		this.setId(id);
		this.setAddress(address);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String address;
	private String targetNamespace;
	private String successResult;
	private String type;
	private String operate;

	// collections
	private java.util.List<com.jeecms.cms.entity.assist.CmsWebserviceParam> params;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="service_id"
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
	 * Return the value associated with the column: service_address
	 */
	public String getAddress () {
		return address;
	}

	/**
	 * Set the value related to the column: service_address
	 * @param address the service_address value
	 */
	public void setAddress (String address) {
		this.address = address;
	}


	/**
	 * Return the value associated with the column: target_namespace
	 */
	public String getTargetNamespace () {
		return targetNamespace;
	}

	/**
	 * Set the value related to the column: target_namespace
	 * @param targetNamespace the target_namespace value
	 */
	public void setTargetNamespace (String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}


	/**
	 * Return the value associated with the column: success_result
	 */
	public String getSuccessResult () {
		return successResult;
	}

	/**
	 * Set the value related to the column: success_result
	 * @param successResult the success_result value
	 */
	public void setSuccessResult (String successResult) {
		this.successResult = successResult;
	}


	/**
	 * Return the value associated with the column: service_type
	 */
	public String getType () {
		return type;
	}

	/**
	 * Set the value related to the column: service_type
	 * @param type the service_type value
	 */
	public void setType (String type) {
		this.type = type;
	}


	/**
	 * Return the value associated with the column: service_operate
	 */
	public String getOperate () {
		return operate;
	}

	/**
	 * Set the value related to the column: service_operate
	 * @param operate the service_operate value
	 */
	public void setOperate (String operate) {
		this.operate = operate;
	}


	/**
	 * Return the value associated with the column: params
	 */
	public java.util.List<com.jeecms.cms.entity.assist.CmsWebserviceParam> getParams () {
		return params;
	}

	/**
	 * Set the value related to the column: params
	 * @param params the params value
	 */
	public void setParams (java.util.List<com.jeecms.cms.entity.assist.CmsWebserviceParam> params) {
		this.params = params;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsWebservice)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsWebservice cmsWebservice = (com.jeecms.cms.entity.assist.CmsWebservice) obj;
			if (null == this.getId() || null == cmsWebservice.getId()) return false;
			else return (this.getId().equals(cmsWebservice.getId()));
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