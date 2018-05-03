package com.home.system.service.impl;

import java.awt.Menu;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.system.dao.MenuDao;
import com.home.system.service.MenuService;

@Component
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	@Override
	public List<Menu> list(Long id) {
		
		return null;
	}

}
