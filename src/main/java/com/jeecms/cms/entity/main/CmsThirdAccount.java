package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseCmsThirdAccount;



public class CmsThirdAccount extends BaseCmsThirdAccount {
	private static final long serialVersionUID = 1L;
	
	public static final String QQ_KEY="openId";
	public static final String SINA_KEY="uid";
	public static final String QQ_PLAT="QQ";
	public static final String SINA_PLAT="SINA";
	public static final String WEIXIN_PLAT="WEIXIN";
	public static final String QQ_WEBO_KEY="weboOpenId";
	public static final String QQ_WEBO_PLAT="QQWEBO";
	public static final String WEIXIN_KEY="weixinOpenId";
/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsThirdAccount () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsThirdAccount (Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsThirdAccount (
		Long id,
		String accountKey,
		String username,
		String source) {

		super (
			id,
			accountKey,
			username,
			source);
	}

/*[CONSTRUCTOR MARKER END]*/


}