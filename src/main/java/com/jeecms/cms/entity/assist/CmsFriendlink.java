package com.jeecms.cms.entity.assist;

import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.jeecms.cms.entity.assist.base.BaseCmsFriendlink;
import com.jeecms.core.entity.CmsSite;
import com.jeecms.core.entity.Ftp;

public class CmsFriendlink extends BaseCmsFriendlink {
	private static final long serialVersionUID = 1L;

	public void init() {
		if (getPriority() == null) {
			setPriority(10);
		}
		if (getViews() == null) {
			setViews(0);
		}
		if (getEnabled() == null) {
			setEnabled(true);
		}
		blankToNull();
	}

	public void blankToNull() {
		if (StringUtils.isBlank(getLogo())) {
			setLogo(null);
		}
	}
	
	public JSONObject convertToJson(Integer https) 
			throws JSONException{
		JSONObject json=new JSONObject();
		json.put("id", getId());
		json.put("priority", getPriority());
		json.put("name", getName());
		json.put("domain", getDomain());
		CmsSite site=getSite();
		String urlPrefix="";
		if(https==com.jeecms.cms.api.Constants.URL_HTTP){
			urlPrefix=site.getUrlPrefixWithNoDefaultPort();
		}else{
			urlPrefix=site.getSafeUrlPrefix();
		}
		Ftp uploadFtp=site.getUploadFtp();
		boolean uploadToFtp=false;
		if(uploadFtp!=null){
			uploadToFtp=true;
		}
		if(!uploadToFtp){
			if(StringUtils.isNotBlank(getLogo())){
				json.put("logo", urlPrefix+getLogo());
			}else{
				json.put("logo", "");
			}
		}else{
			if(StringUtils.isNotBlank(getLogo())){
				json.put("logo", getLogo());
			}else{
				json.put("logo", "");
			}
		}
		json.put("email", getEmail());
		json.put("description", getDescription());
		json.put("views", getViews());
		json.put("enabled", getEnabled());
		json.put("category", getCategory().getName());
		return json;
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsFriendlink() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsFriendlink(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsFriendlink(Integer id,
			com.jeecms.cms.entity.assist.CmsFriendlinkCtg category,
			com.jeecms.core.entity.CmsSite site, String name,
			String domain, Integer views,
			Integer priority, Boolean enabled) {

		super(id, category, site, name, domain, views, priority, enabled);
	}

	/* [CONSTRUCTOR MARKER END] */

}