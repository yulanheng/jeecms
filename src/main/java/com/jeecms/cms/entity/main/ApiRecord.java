package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseApiRecord;



public class ApiRecord extends BaseApiRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ApiRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ApiRecord (Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ApiRecord (
		Long id,
		com.jeecms.cms.entity.main.ApiAccount apiAccount,
		ApiInfo apiInfo,
		java.util.Date callTime,
		Long callTimeStamp) {

		super (
			id,
			apiAccount,
			apiInfo,
			callTime,
			callTimeStamp);
	}

/*[CONSTRUCTOR MARKER END]*/


}