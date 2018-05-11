package com.home.common.dao;

import java.util.List;
import java.util.Map;

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
	List<DictDO> list(Map<String, Object> map);
	
	/**
	 * 查询所有的字典类型
	 * @return
	 */
	List<DictDO> listType();
	
	/**
	 * 查询条数
	 * @return
	 */
	int count(Map<String, Object> map);
	
	/**
	 * 通过id查询字典
	 * @param id
	 * @return
	 */
	DictDO getById(Long id);
	
	/**
	 * 更新字典数据
	 * @param dictDO
	 */
	int update(DictDO dictDO);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
