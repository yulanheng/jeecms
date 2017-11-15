package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_search_words table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_search_words"
 */

public abstract class BaseCmsSearchWords  implements Serializable {

	public static String REF = "CmsSearchWords";
	public static String PROP_NAME = "name";
	public static String PROP_HIT_COUNT = "hitCount";
	public static String PROP_NAME_INITIAL = "nameInitial";
	public static String PROP_ID = "id";
	public static String PROP_PRIORITY = "priority";


	// constructors
	public BaseCmsSearchWords () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSearchWords (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSearchWords (
		Integer id,
		String name,
		Integer hitCount,
		Integer priority,
		String nameInitial) {

		this.setId(id);
		this.setName(name);
		this.setHitCount(hitCount);
		this.setPriority(priority);
		this.setNameInitial(nameInitial);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Integer hitCount;
	private Integer priority;
	private String nameInitial;
	private Boolean recommend;
	private com.jeecms.core.entity.CmsSite site;


	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="word_id"
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
	 * Return the value associated with the column: name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: name
	 * @param name the name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: hit_count
	 */
	public Integer getHitCount () {
		return hitCount;
	}

	/**
	 * Set the value related to the column: hit_count
	 * @param hitCount the hit_count value
	 */
	public void setHitCount (Integer hitCount) {
		this.hitCount = hitCount;
	}


	/**
	 * Return the value associated with the column: priority
	 */
	public Integer getPriority () {
		return priority;
	}

	/**
	 * Set the value related to the column: priority
	 * @param priority the priority value
	 */
	public void setPriority (Integer priority) {
		this.priority = priority;
	}


	/**
	 * Return the value associated with the column: name_initial
	 */
	public String getNameInitial () {
		return nameInitial;
	}

	/**
	 * Set the value related to the column: name_initial
	 * @param nameInitial the name_initial value
	 */
	public void setNameInitial (String nameInitial) {
		this.nameInitial = nameInitial;
	}

	public Boolean getRecommend() {
		return recommend;
	}

	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}
	
	public com.jeecms.core.entity.CmsSite getSite() {
		return site;
	}

	public void setSite(com.jeecms.core.entity.CmsSite site) {
		this.site = site;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsSearchWords)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsSearchWords cmsSearchWords = (com.jeecms.cms.entity.assist.CmsSearchWords) obj;
			if (null == this.getId() || null == cmsSearchWords.getId()) return false;
			else return (this.getId().equals(cmsSearchWords.getId()));
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