package com.home.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.home.system.domain.MenuDO;

@Mapper
public interface MenuDao {
	List<MenuDO> getMenus(Long user_id); 
}
