package com.home.system.service;

import java.awt.Menu;
import java.util.List;

public interface MenuService {
	
	/**
	 * 查询所有用户对应的菜单
	 * @param id
	 * @return
	 */
	List<Menu> list(Long id);
}
