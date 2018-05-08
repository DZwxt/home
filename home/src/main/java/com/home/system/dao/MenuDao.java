package com.home.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.home.system.domain.MenuDO;

@Mapper
public interface MenuDao {
	/**
	 * 获取所有的菜单
	 * @param user_id 用户id
	 * @return
	 */
	List<MenuDO> getMenus(Long user_id); 
	
	/**
	 * 获取所有的权限
	 * @param user_id 用户id
	 * @return
	 */
	List<String> getPerms(Long user_id);
}
