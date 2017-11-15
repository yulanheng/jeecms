package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_site_access_pages table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_site_access_pages"
 */

public abstract class BaseCmsSiteAccessPages  implements Serializable {

	public static String REF = "CmsSiteAccessPages";
	public static String PROP_SESSION_ID = "sessionId";
	public static String PROP_VISIT_SECOND = "visitSecond";
	public static String PROP_SITE = "site";
	public static String PROP_ID = "id";
	public static String PROP_ACCESS_TIME = "accessTime";
	public static String PROP_ACCESS_DATE = "accessDate";
	public static String PROP_ACCESS_PAGE = "accessPage";
	public static String PROP_PAGE_INDEX = "pageIndex";


	// constructors
	public BaseCmsSiteAccessPages () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSiteAccessPages (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSiteAccessPages (
		Integer id,
		com.jeecms.core.entity.CmsSite site,
		String accessPage,
		String sessionId,
		java.util.Date accessTime,
		java.util.Date accessDate,
		Integer visitSecond,
		Integer pageIndex) {

		this.setId(id);
		this.setSite(site);
		this.setAccessPage(accessPage);
		this.setSessionId(sessionId);
		this.setAccessTime(accessTime);
		this.setAccessDate(accessDate);
		this.setVisitSecond(visitSecond);
		this.setPageIndex(pageIndex);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String accessPage;
	private String sessionId;
	private java.util.Date accessTime;
	private java.util.Date accessDate;
	private Integer visitSecond;
	private Integer pageIndex;

	// many to one
	private com.jeecms.core.entity.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="access_pages_id"
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
	 * Return the value associated with the column: access_page
	 */
	public String getAccessPage () {
		return accessPage;
	}

	/**
	 * Set the value related to the column: access_page
	 * @param accessPage the access_page value
	 */
	public void setAccessPage (String accessPage) {
		this.accessPage = accessPage;
	}


	/**
	 * Return the value associated with the column: session_id
	 */
	public String getSessionId () {
		return sessionId;
	}

	/**
	 * Set the value related to the column: session_id
	 * @param sessionId the session_id value
	 */
	public void setSessionId (String sessionId) {
		this.sessionId = sessionId;
	}


	/**
	 * Return the value associated with the column: access_time
	 */
	public java.util.Date getAccessTime () {
		return accessTime;
	}

	/**
	 * Set the value related to the column: access_time
	 * @param accessTime the access_time value
	 */
	public void setAccessTime (java.util.Date accessTime) {
		this.accessTime = accessTime;
	}


	/**
	 * Return the value associated with the column: access_date
	 */
	public java.util.Date getAccessDate () {
		return accessDate;
	}

	/**
	 * Set the value related to the column: access_date
	 * @param accessDate the access_date value
	 */
	public void setAccessDate (java.util.Date accessDate) {
		this.accessDate = accessDate;
	}


	/**
	 * Return the value associated with the column: visit_second
	 */
	public Integer getVisitSecond () {
		return visitSecond;
	}

	/**
	 * Set the value related to the column: visit_second
	 * @param visitSecond the visit_second value
	 */
	public void setVisitSecond (Integer visitSecond) {
		this.visitSecond = visitSecond;
	}


	/**
	 * Return the value associated with the column: page_index
	 */
	public Integer getPageIndex () {
		return pageIndex;
	}

	/**
	 * Set the value related to the column: page_index
	 * @param pageIndex the page_index value
	 */
	public void setPageIndex (Integer pageIndex) {
		this.pageIndex = pageIndex;
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
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsSiteAccessPages)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsSiteAccessPages cmsSiteAccessPages = (com.jeecms.cms.entity.assist.CmsSiteAccessPages) obj;
			if (null == this.getId() || null == cmsSiteAccessPages.getId()) return false;
			else return (this.getId().equals(cmsSiteAccessPages.getId()));
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