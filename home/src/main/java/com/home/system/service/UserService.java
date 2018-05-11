package com.home.system.service;

import java.util.List;

import com.home.common.util.Query;
import com.home.system.domain.UserDO;

public interface UserService {
	
	/**
	 * 登陆
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	UserDO login(String username,String password);
	
	/**
	 * 查询用户列表
	 * @return
	 */
	List<UserDO> list(Query query);
	
	/**
	 * 查询所有用户数
	 * @return
	 */
	int count();
}
