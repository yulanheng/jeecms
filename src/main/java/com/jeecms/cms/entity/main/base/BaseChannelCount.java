package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_channel_count table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_channel_count"
 */

public abstract class BaseChannelCount  implements Serializable {

	public static String REF = "ChannelCount";
	public static String PROP_CHANNEL = "channel";
	public static String PROP_VIEWS_MONTH = "viewsMonth";
	public static String PROP_VIEWS_WEEK = "viewsWeek";
	public static String PROP_VIEWS = "views";
	public static String PROP_ID = "id";
	public static String PROP_VIEWS_DAY = "viewsDay";


	// constructors
	public BaseChannelCount () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseChannelCount (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseChannelCount (
		Integer id,
		Integer views,
		Integer viewsMonth,
		Integer viewsWeek,
		Integer viewsDay) {

		this.setId(id);
		this.setViews(views);
		this.setViewsMonth(viewsMonth);
		this.setViewsWeek(viewsWeek);
		this.setViewsDay(viewsDay);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Integer views;
	private Integer viewsMonth;
	private Integer viewsWeek;
	private Integer viewsDay;
	private Integer contentDay;
	private Integer contentMonth;
	private Integer contentWeek;
	private Integer contentYear;
	private Integer contentTotal;

	// one to one
	private com.jeecms.cms.entity.main.Channel channel;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="channel_id"
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
	 * Return the value associated with the column: views
	 */
	public Integer getViews () {
		return views;
	}

	/**
	 * Set the value related to the column: views
	 * @param views the views value
	 */
	public void setViews (Integer views) {
		this.views = views;
	}


	/**
	 * Return the value associated with the column: views_month
	 */
	public Integer getViewsMonth () {
		return viewsMonth;
	}

	/**
	 * Set the value related to the column: views_month
	 * @param viewsMonth the views_month value
	 */
	public void setViewsMonth (Integer viewsMonth) {
		this.viewsMonth = viewsMonth;
	}


	/**
	 * Return the value associated with the column: views_week
	 */
	public Integer getViewsWeek () {
		return viewsWeek;
	}

	/**
	 * Set the value related to the column: views_week
	 * @param viewsWeek the views_week value
	 */
	public void setViewsWeek (Integer viewsWeek) {
		this.viewsWeek = viewsWeek;
	}


	/**
	 * Return the value associated with the column: views_day
	 */
	public Integer getViewsDay () {
		return viewsDay;
	}

	/**
	 * Set the value related to the column: views_day
	 * @param viewsDay the views_day value
	 */
	public void setViewsDay (Integer viewsDay) {
		this.viewsDay = viewsDay;
	}

	public Integer getContentDay() {
		return contentDay;
	}

	public void setContentDay(Integer contentDay) {
		this.contentDay = contentDay;
	}

	public Integer getContentMonth() {
		return contentMonth;
	}

	public void setContentMonth(Integer contentMonth) {
		this.contentMonth = contentMonth;
	}

	public Integer getContentWeek() {
		return contentWeek;
	}

	public void setContentWeek(Integer contentWeek) {
		this.contentWeek = contentWeek;
	}

	public Integer getContentYear() {
		return contentYear;
	}

	public void setContentYear(Integer contentYear) {
		this.contentYear = contentYear;
	}

	public Integer getContentTotal() {
		return contentTotal;
	}

	public void setContentTotal(Integer contentTotal) {
		this.contentTotal = contentTotal;
	}

	/**
	 * Return the value associated with the column: channel
	 */
	public com.jeecms.cms.entity.main.Channel getChannel () {
		return channel;
	}

	/**
	 * Set the value related to the column: channel
	 * @param channel the channel value
	 */
	public void setChannel (com.jeecms.cms.entity.main.Channel channel) {
		this.channel = channel;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.ChannelCount)) return false;
		else {
			com.jeecms.cms.entity.main.ChannelCount channelCount = (com.jeecms.cms.entity.main.ChannelCount) obj;
			if (null == this.getId() || null == channelCount.getId()) return false;
			else return (this.getId().equals(channelCount.getId()));
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