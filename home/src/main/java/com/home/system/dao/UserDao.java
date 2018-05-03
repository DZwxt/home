package com.home.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.home.system.domain.UserDO;

@Mapper
public interface UserDao {
	
	List<UserDO> list(Map<String, Object> map);
}
