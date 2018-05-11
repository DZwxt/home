package com.home.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.common.domain.Tree;
import com.home.common.util.BuildTree;
import com.home.system.dao.DeptDao;
import com.home.system.domain.DeptDO;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao deptDao;
	@Override
	public Tree<DeptDO> listTree() {
		List<DeptDO> list = deptDao.list();
		List<Tree<DeptDO>> trees = new ArrayList<Tree<DeptDO>>();
		for (DeptDO dept : list) {
			Tree<DeptDO> tree = new Tree<DeptDO>();
			tree.setText(dept.getName());
			tree.setId(dept.getDeptId().toString());
			tree.setParentId(dept.getParentId().toString());
			trees.add(tree);
		}
		Tree<DeptDO> tree = BuildTree.build(trees);
		return tree;
	}

}
