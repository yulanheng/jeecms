package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content"
 */

public abstract class BaseContentRewardFix  implements Serializable {


	// constructors
	public BaseContentRewardFix () {
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentRewardFix (
		Double fixVal) {
		this.setFixVal(fixVal);
		initialize();
	}

	protected void initialize () {}



	// fields
	private Double fixVal;
	

	public Double getFixVal() {
		return fixVal;
	}

	public void setFixVal(Double fixVal) {
		this.fixVal = fixVal;
	}

	public String toString () {
		return super.toString();
	}


}