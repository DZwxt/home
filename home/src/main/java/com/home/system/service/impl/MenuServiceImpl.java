package com.home.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.common.domain.Tree;
import com.home.common.util.BuildTree;
import com.home.system.dao.MenuDao;
import com.home.system.domain.MenuDO;
import com.home.system.service.MenuService;

@Component
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;

	/**
	 * 返回用户所对应的菜单，为树形结构
	 */
	@Override
	public List<Tree<MenuDO>> list(Long id) {
		List<Tree<MenuDO>> treeList = new ArrayList<Tree<MenuDO>>();
		List<MenuDO> menus = menuDao.getMenus(id);
		for (MenuDO menuDO : menus) {
			Tree<MenuDO> tree = new Tree<MenuDO>();
			tree.setId(menuDO.getMenuId().toString());
			tree.setParentId(menuDO.getParentId().toString());
			tree.setText(menuDO.getName());
			Map<String, Object> attributes = new HashMap<String, Object>();
			attributes.put("url", menuDO.getUrl());
			attributes.put("icon", menuDO.getIcon());
			tree.setAttributes(attributes);
			treeList.add(tree);
		}
		List<Tree<MenuDO>> buildList = BuildTree.buildList(treeList, "0");
		return buildList;
	}

	/**
	 * 获取权限
	 */
	@Override
	public Set<String> getPerms(Long userId) {
		Set<String> permSet = new HashSet<String>();
		List<String> perms = menuDao.getPerms(userId);
		for (String perm : perms) {
			if (StringUtils.isNotBlank(perm)) {
				permSet.addAll(Arrays.asList(perm.trim().split(",")));
			}
		}
		return permSet;
	}

}
