package com.home.common.controller;

import com.home.common.util.ShiroUtils;
import com.home.system.domain.UserDO;

public class BaseController {

	public UserDO getUser(){
		return ShiroUtils.getUser();
	}
	
	public Long getUserId(){
		return getUser().getUserId();
	}
	
	public String getUserName(){
		return getUser().getUsername();
	}
}
