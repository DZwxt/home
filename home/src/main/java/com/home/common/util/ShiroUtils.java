package com.home.common.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.home.system.domain.UserDO;

public class ShiroUtils {

	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
	
	public static UserDO getUser(){
		return (UserDO) getSubject().getPrincipal();
	}
	
	public static Long getUserId(){
		return getUser().getUserId();
	}
	
	public static void logout(){
		getSubject().logout();
	}
}
