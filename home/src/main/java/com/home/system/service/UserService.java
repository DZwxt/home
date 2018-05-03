package com.home.system.service;

import com.home.system.domain.UserDO;

public interface UserService {
	
	/**
	 * 登陆
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	UserDO login(String username,String password);
}
