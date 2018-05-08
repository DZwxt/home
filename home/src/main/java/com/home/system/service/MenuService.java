package com.home.system.service;

import java.util.List;
import java.util.Set;

import com.home.common.domain.Tree;
import com.home.system.domain.MenuDO;

public interface MenuService {
	
	/**
	 * 查询所有用户对应的菜单
	 * @param id
	 * @return
	 */
	List<Tree<MenuDO>> list(Long id);
	
	/**
	 * 查询用户对应的权限
	 * @param userId
	 * @return
	 */
	Set<String> getPerms(Long userId);
}
