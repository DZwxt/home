package com.home.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.home.system.domain.UserDO;

@Mapper
public interface UserDao {
	
	/**
	 * 查询用户列表
	 * @param map
	 * @return
	 */
	List<UserDO> list(Map<String, Object> map);
	
	/**
	 * 查询所有用户数
	 * @return
	 */
	int count();
	
}
