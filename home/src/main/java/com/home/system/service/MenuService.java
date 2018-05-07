package com.home.system.service;

import java.util.Set;

import com.home.system.domain.MenuDO;

public interface MenuService {
	
	/**
	 * 查询所有用户对应的菜单
	 * @param id
	 * @return
	 */
	Set<MenuDO> list(Long id);
}
