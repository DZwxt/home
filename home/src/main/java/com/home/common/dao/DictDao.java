package com.home.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.home.common.domain.DictDO;
import com.home.common.util.Query;

@Mapper
public interface DictDao {

	/**
	 * 查询所有的字典
	 * @param query
	 * @return
	 */
	List<DictDO> list(Query query);
	
	/**
	 * 查询所有的字典类型
	 * @return
	 */
	List<DictDO> listType();
}
