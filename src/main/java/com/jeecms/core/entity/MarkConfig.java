package com.jeecms.core.entity;

import com.jeecms.core.entity.base.BaseMarkConfig;



public class MarkConfig extends BaseMarkConfig {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MarkConfig () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public MarkConfig (
		Boolean on,
		Integer minWidth,
		Integer minHeight,
		String content,
		Integer size,
		String color,
		Integer alpha,
		Integer pos,
		Integer offsetX,
		Integer offsetY) {

		super (
			on,
			minWidth,
			minHeight,
			content,
			size,
			color,
			alpha,
			pos,
			offsetX,
			offsetY);
	}

/*[CONSTRUCTOR MARKER END]*/


}