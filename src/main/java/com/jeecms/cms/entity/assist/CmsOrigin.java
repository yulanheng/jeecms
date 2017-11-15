package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsOrigin;



public class CmsOrigin extends BaseCmsOrigin {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsOrigin () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsOrigin (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsOrigin (
		Integer id,
		String name,
		Integer refCount) {

		super (
			id,
			name,
			refCount);
	}

/*[CONSTRUCTOR MARKER END]*/


}