package com.jeecms.plug.store.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_plug_store_config table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_plug_store_config"
 */

public abstract class BasePlugStoreConfig  implements Serializable {

	public static String REF = "PlugStoreConfig";
	public static String PROP_MAINTAIN_COMPANY = "maintainCompany";
	public static String PROP_SERVER_URL = "serverUrl";
	public static String PROP_MAINTAIN_TEL = "maintainTel";
	public static String PROP_PASSWOD = "passwod";
	public static String PROP_ID = "id";


	// constructors
	public BasePlugStoreConfig () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePlugStoreConfig (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePlugStoreConfig (
		Integer id,
		String serverUrl,
		String passwod) {

		this.setId(id);
		this.setServerUrl(serverUrl);
		this.setPassword(passwod);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String serverUrl;
	private String password;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="config_id"
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
	 * Return the value associated with the column: server_url
	 */
	public String getServerUrl () {
		return serverUrl;
	}

	/**
	 * Set the value related to the column: server_url
	 * @param serverUrl the server_url value
	 */
	public void setServerUrl (String serverUrl) {
		this.serverUrl = serverUrl;
	}


	/**
	 * Return the value associated with the column: passwod
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.plug.store.entity.PlugStoreConfig)) return false;
		else {
			com.jeecms.plug.store.entity.PlugStoreConfig plugStoreConfig = (com.jeecms.plug.store.entity.PlugStoreConfig) obj;
			if (null == this.getId() || null == plugStoreConfig.getId()) return false;
			else return (this.getId().equals(plugStoreConfig.getId()));
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