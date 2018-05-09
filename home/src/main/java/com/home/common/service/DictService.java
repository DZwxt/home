package com.home.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.home.common.domain.DictDO;
import com.home.common.util.Query;
import com.home.common.util.R;

@Service
public interface DictService {

	List<DictDO> listType();
	
	/**
	 * 查询列表
	 * @param query
	 * @return
	 */
	List<DictDO> list(Query query);
	
	/**
	 * 查询所有的类型
	 * @param map
	 * @return
	 */
	int count(Map<String, Object> map);
	
	/**
	 * 根据id查询字典
	 * @param id
	 * @return
	 */
	DictDO getById(Long id);
	
	/**
	 * 更新字典
	 * @param dictDO
	 */
	R update(DictDO dictDO);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	R delete(Long id);
}
