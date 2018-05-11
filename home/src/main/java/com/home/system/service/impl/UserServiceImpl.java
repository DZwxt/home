package com.home.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.common.util.Query;
import com.home.system.dao.UserDao;
import com.home.system.domain.UserDO;
import com.home.system.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDO login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 查询用户列表
	 */
	@Override
	public List<UserDO> list(Query query) {
		List<UserDO> list = userDao.list(query);
		return list;
	}

	/**
	 * 查询所有用户数
	 */
	@Override
	public int count() {
		return userDao.count();
	}

}
