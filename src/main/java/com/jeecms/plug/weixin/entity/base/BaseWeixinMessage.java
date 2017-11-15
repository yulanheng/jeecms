package com.jeecms.plug.weixin.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jg_weixinmessage table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jg_weixinmessage"
 */

public abstract class BaseWeixinMessage  implements Serializable {

	public static String REF = "WeixinMessage";
	public static String PROP_SITE = "site";
	public static String PROP_URL = "url";
	public static String PROP_NUMBER = "number";
	public static String PROP_ID = "id";
	public static String PROP_CONTENT = "content";
	public static String PROP_WELCOME = "welcome";
	public static String PROP_TITLE = "title";
	public static String PROP_PATH = "path";


	// constructors
	public BaseWeixinMessage () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseWeixinMessage (Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String number;
	private String title;
	private String path;
	private String url;
	private String content;
	private Boolean welcome;
	private Integer type;

	// many to one
	private com.jeecms.core.entity.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="wm_id"
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
	 * Return the value associated with the column: wm_number
	 */
	public String getNumber () {
		return number;
	}

	/**
	 * Set the value related to the column: wm_number
	 * @param number the wm_number value
	 */
	public void setNumber (String number) {
		this.number = number;
	}



	/**
	 * Return the value associated with the column: wm_title
	 */
	public String getTitle () {
		return title;
	}

	/**
	 * Set the value related to the column: wm_title
	 * @param title the wm_title value
	 */
	public void setTitle (String title) {
		this.title = title;
	}



	/**
	 * Return the value associated with the column: wm_path
	 */
	public String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: wm_path
	 * @param path the wm_path value
	 */
	public void setPath (String path) {
		this.path = path;
	}



	/**
	 * Return the value associated with the column: wm_url
	 */
	public String getUrl () {
		return url;
	}

	/**
	 * Set the value related to the column: wm_url
	 * @param url the wm_url value
	 */
	public void setUrl (String url) {
		this.url = url;
	}



	/**
	 * Return the value associated with the column: wm_content
	 */
	public String getContent () {
		return content;
	}

	/**
	 * Set the value related to the column: wm_content
	 * @param content the wm_content value
	 */
	public void setContent (String content) {
		this.content = content;
	}



	/**
	 * Return the value associated with the column: is_welcome
	 */
	public Boolean isWelcome () {
		return welcome;
	}

	/**
	 * Set the value related to the column: is_welcome
	 * @param welcome the is_welcome value
	 */
	public void setWelcome (Boolean welcome) {
		this.welcome = welcome;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * Return the value associated with the column: site_id
	 */
	public com.jeecms.core.entity.CmsSite getSite () {
		return site;
	}

	/**
	 * Set the value related to the column: site_id
	 * @param site the site_id value
	 */
	public void setSite (com.jeecms.core.entity.CmsSite site) {
		this.site = site;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.plug.weixin.entity.WeixinMessage)) return false;
		else {
			com.jeecms.plug.weixin.entity.WeixinMessage weixinMessage = (com.jeecms.plug.weixin.entity.WeixinMessage) obj;
			if (null == this.getId() || null == weixinMessage.getId()) return false;
			else return (this.getId().equals(weixinMessage.getId()));
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