package com.home.system.service.impl;

import com.home.common.domain.Tree;
import com.home.system.domain.DeptDO;

public interface DeptService {

	/**
	 * 部门树形菜单
	 * @return
	 */
	Tree<DeptDO> listTree();
}
