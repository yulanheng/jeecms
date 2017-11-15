package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseApiInfo;



public class ApiInfo extends BaseApiInfo {
	private static final long serialVersionUID = 1L;
	
	public void init(){
		if(getCallDayCount()==null){
			setCallDayCount(0);
		}
		if(getCallMonthCount()==null){
			setCallMonthCount(0);
		}
		if(getCallWeekCount()==null){
			setCallWeekCount(0);
		}
		if(getCallTotalCount()==null){
			setCallTotalCount(0);
		}
	}
	public boolean getDisabled () {
		return super.isDisabled();
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ApiInfo () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ApiInfo (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ApiInfo (
		Integer id,
		String url,
		String code,
		boolean disabled,
		Integer callTotalCount,
		Integer callMonthCount,
		Integer callWeekCount,
		Integer callDayCount) {

		super (
			id,
			url,
			code,
			disabled,
			callTotalCount,
			callMonthCount,
			callWeekCount,
			callDayCount);
	}

/*[CONSTRUCTOR MARKER END]*/


}