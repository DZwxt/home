package com.home.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.home.system.domain.DeptDO;

@Mapper
public interface DeptDao {

	/**
	 * 查询所有部门
	 * @return
	 */
	List<DeptDO> list();
}
