package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseApiUserLogin;



public class ApiUserLogin extends BaseApiUserLogin {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ApiUserLogin () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ApiUserLogin (Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ApiUserLogin (
		Long id,
		String sesssionKey,
		String username,
		java.util.Date loginTime,
		Integer loginCount) {

		super (
			id,
			sesssionKey,
			username,
			loginTime,
			loginCount);
	}

/*[CONSTRUCTOR MARKER END]*/


}