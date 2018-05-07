package com.home.system.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.system.dao.MenuDao;
import com.home.system.domain.MenuDO;
import com.home.system.service.MenuService;

@Component
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	@Override
	public Set<MenuDO> list(Long id) {
		
		return null;
	}

}
